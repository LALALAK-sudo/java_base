package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.util.JedisUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDao dao = new CategoryDaoImpl();
    @Override
    public List<Category> findAll() {
        // 1 从redis中查询
        // 1.1 获取jedis客户端
        Jedis jedis = JedisUtil.getJedis();
        // 1.2 可以使用sortedset排序
//        Set<String> categories = jedis.zrange("category", 0, -1);
        Set<Tuple> categories = jedis.zrangeWithScores("category", 0, -1);
        List<Category> cs = null;
        // 2 判断查询的集合是否为空
        if(categories == null || categories.size() == 0) {
//            System.out.println("mysql");
            // 查询为空，从数据库查询，并且存入redis中
            cs = dao.findAll();
            for (int i = 0; i < cs.size(); i++) {
                jedis.zadd("category",cs.get(i).getCid(),cs.get(i).getCname());
            }
        }else {
//            System.out.println("jedis");
            // 不为空，将set转为list返回
            cs = new ArrayList<Category>();
            for (Tuple tuple : categories) {
                Category category = new Category();
                category.setCname(tuple.getElement());
                category.setCid((int)tuple.getScore());
                cs.add(category);
            }
        }
        return cs;
    }
}
