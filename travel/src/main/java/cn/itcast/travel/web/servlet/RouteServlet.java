package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.FavoriteService;
import cn.itcast.travel.service.RouteService;
import cn.itcast.travel.service.impl.FavoriteServiceImpl;
import cn.itcast.travel.service.impl.RouteServiceImpl;
import cn.itcast.travel.web.servlet.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/route/*")
public class RouteServlet extends BaseServlet {
    private RouteService service = new RouteServiceImpl();
    private FavoriteService favoriteService = new FavoriteServiceImpl();
    public void pageQuery(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String currentPageStr = request.getParameter("currentPage");
        String pageSizeStr = request.getParameter("pageSize");
        String cidStr = request.getParameter("cid");

        // 接受搜索的线路名字

        String rname = request.getParameter("rname");

//        rname = new String(rname.getBytes("iso-8859-1"),"utf-8");


        int cid = 0;
        if(cidStr != null && cidStr.length() > 0 && !"null".equals(cidStr)) {
            cid = Integer.parseInt(cidStr);
        }

        int currentPage = 1;
        if(currentPageStr != null && currentPageStr.length() > 0) {
            currentPage = Integer.parseInt(currentPageStr);
        }

        int pageSize = 5;
        if(pageSizeStr != null && pageSizeStr.length() > 0) {
            pageSize = Integer.parseInt(pageSizeStr);
        }

        // 调用service获得pageBean对象
        PageBean<Route> pb = service.pageQuery(cid, currentPage, pageSize, rname);
        // 将pageBean序列化为Json输出
        writeValue(pb,response);

    }
    public void findOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 接收id
        String rid = request.getParameter("rid");
        Route route = service.findOne(rid);
        writeValue(route,response);
    }

    /**判断当前用户是否收藏过盖线路
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void isFavorite(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rid = request.getParameter("rid");
//        System.out.println("11111111111111111111");
        User user = (User) request.getSession().getAttribute("user");
        int uid = 0;
        if(user != null) {
            uid = user.getUid();
        }

        // 调用FavoriteService
        boolean flag = favoriteService.isFavorite(rid, uid);
//        System.out.println(rid);
//        System.out.println(uid);
//        System.out.println(flag);
        writeValue(flag,response);
    }
    public void addFavorite(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rid = request.getParameter("rid");
        User user = (User) request.getSession().getAttribute("user");
        int uid ;
        if(user == null) {
            return;
        }else {
            uid = user.getUid();
        }
        favoriteService.add(rid,uid);
    }
}
