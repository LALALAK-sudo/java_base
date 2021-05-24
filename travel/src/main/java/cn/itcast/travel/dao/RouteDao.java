package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.RouteImg;

import java.util.List;

public interface RouteDao {
    /**
     * 根据cid查询总记录数
     */
    public abstract int findTotalCount(int cid, String rname);

    /**
     * 查询分页的数据集合
     */
    public abstract List<Route> findByPage(int cid, int start, int pageSize, String rname);

    public abstract Route findOne(int rid);

}
