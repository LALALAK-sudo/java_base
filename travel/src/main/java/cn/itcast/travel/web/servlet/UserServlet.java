package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.ResultInfo;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {

    private UserService userService = new UserServiceImpl();

    /**
     * 注册功能
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 校验验证码
        // 1 获取前台验证码
        String check = request.getParameter("check");
        // 2 获取后台验证码
        HttpSession session = request.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER");

        if(checkcode_server == null || !checkcode_server.equalsIgnoreCase(check)) {
            // 验证码错误
            ResultInfo info = new ResultInfo();
            info.setFlag(false);
            info.setErrorMsg("验证码错误");
            ObjectMapper mapper = new ObjectMapper();
            String json_info = mapper.writeValueAsString(info);
            // 设置response返回
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(json_info);
            return;
        }
        // 获取数据
        Map<String, String[]> map = request.getParameterMap();
        System.out.println("start");
        // 封装User对象
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // 调用service完成注册

        boolean flag = userService.registUser(user);
        // 封装info为返回的提示信息
        ResultInfo info = new ResultInfo();
        if(flag) {
            // 注册成功
            info.setFlag(true);
        }else {
            // 注册失败
            info.setFlag(false);
            info.setErrorMsg("注册失败");
        }
        // 把info转为JSON
        ObjectMapper mapper = new ObjectMapper();
        String json_info = mapper.writeValueAsString(info);
        // 设置response返回
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json_info);
    }

    /**
     * 登录功能
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取用户名和密码
        Map<String, String[]> map = request.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // 用service查询
//        UserService userService = new UserServiceImpl();
        User u = userService.login(user);
        ResultInfo info = new ResultInfo();
        // 用户名或密码错误
        if(u == null) {
            info.setFlag(false);
            info.setErrorMsg("用户名或者密码错误");
        }
        // 用户是否激活
        if(u != null && !"Y".equals(u.getStatus())) {
            info.setFlag(false);
            info.setErrorMsg("用户未激活");
        }
        // 登录成功
        if(u != null && "Y".equals(u.getStatus())) {
            info.setFlag(true);
            info.setErrorMsg("登录成功");
            HttpSession session = request.getSession();
            session.setAttribute("username",u.getName());
            String username = (String)session.getAttribute("username");
            session.setAttribute("user",u);
        }
        ObjectMapper mapper = new ObjectMapper();
        response.setContentType("application/json;charset=utf-8");
        mapper.writeValue(response.getOutputStream(),info);
    }

    /**
     * 查询单个对象
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void findOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 从session中获取
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        // 将user写回客户端
        response.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getOutputStream(),username);
    }

    /**
     * 退出功能
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void exit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 清空session
        HttpSession session = request.getSession();
        session.invalidate();
        // 重定向到login
        response.sendRedirect(request.getContextPath()+"/login.html");
    }


    public void active(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取验证码
        String code = request.getParameter("code");
        if(code != null) {
//            UserService userService = new UserServiceImpl();
            Boolean flag = userService.active(code);
            String content ;
            if(flag) {
                // 激活成功
                content = "激活成功，请<a href='login.html'>登录</a>";
            }else {
                // 激活失败
                content = "激活失败，请联系管理员";
            }
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(content);
        }
    }
}
