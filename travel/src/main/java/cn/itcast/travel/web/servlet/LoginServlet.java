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

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
        UserService userService = new UserServiceImpl();
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
            session.setAttribute("user",u);
//            String username = (String)session.getAttribute("username");
//            System.out.println(username);
        }
        ObjectMapper mapper = new ObjectMapper();
        response.setContentType("application/json;charset=utf-8");
        mapper.writeValue(response.getOutputStream(),info);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
