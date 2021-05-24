package cn.itcast.travel.service;

public interface FavoriteService {
    public abstract boolean isFavorite(String rid, int uid);

    public abstract void add(String rid, int uid);
}
