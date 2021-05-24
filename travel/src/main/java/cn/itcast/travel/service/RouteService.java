package cn.itcast.travel.service;

import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;

public interface RouteService {
    public abstract PageBean<Route> pageQuery(int cid, int currentPge, int pageSize, String rname);

    public abstract Route findOne(String rid);
}
