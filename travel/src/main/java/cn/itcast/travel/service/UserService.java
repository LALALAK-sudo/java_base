package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

public interface UserService {
    public abstract boolean registUser(User user);

    public abstract Boolean active(String code);

    public abstract User login(User user);
}
