package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {
    public abstract User findByUsername(String username);
    public abstract void save(User user);

    public abstract User findByCode(String code);
    public abstract void updateStatus(User user);
    public abstract User findByUsernameAndPassword(String username, String password);
}
