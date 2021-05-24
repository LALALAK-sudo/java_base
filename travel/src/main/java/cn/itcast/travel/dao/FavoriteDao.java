package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Favorite;

public interface FavoriteDao {

    public abstract Favorite findByRidAndUid(int rid, int uid);

    public abstract int findCountByRid(int rid);

    public abstract void add(int rid, int uid);
}
