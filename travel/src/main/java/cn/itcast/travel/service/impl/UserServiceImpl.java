package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;
import cn.itcast.travel.util.UuidUtil;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public boolean registUser(User user) {
        // 根据user查询用户对象
        User u = userDao.findByUsername(user.getUsername());
        // 判断返回的user是否为null
        if(u != null) {
            //查询到了
            return  false;
        }
        // 设置激活码
        user.setCode(UuidUtil.getUuid());
        // 设置状态码
        user.setStatus("N");
        // 激活邮箱发送 到activeServlet
        String content = "<a href='http://localhost:80/travel/user/active?code="+user.getCode()+"'>点击激活[黑马旅游网]</a>";
        MailUtils.sendMail(user.getEmail(),content,"激活");
        userDao.save(user);
        return true;
    }

    @Override
    public Boolean active(String code) {
        User user = userDao.findByCode(code);
        if(user != null) {
            // 找到了code 激活成功，修改状态码
            userDao.updateStatus(user);
            return true;
        }else {
            // 激活失败
            return false;
        }

    }

    @Override
    public User login(User user) {
        return userDao.findByUsernameAndPassword(user.getUsername(),user.getPassword());
    }
}
