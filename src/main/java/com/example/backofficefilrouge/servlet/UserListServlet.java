package com.example.backofficefilrouge.servlet;

import com.example.backofficefilrouge.Dao.UserDao;
import com.example.backofficefilrouge.entity.UserrEntity;
import com.example.backofficefilrouge.factory.DaoFactory;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserListServlet", value = "/user")
public class UserListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao<UserrEntity> userDao = DaoFactory.getUserDao();
        List<UserrEntity> userList = userDao.findAll();

        request.setAttribute("users", userList);
        request.getRequestDispatcher("/WEB-INF/user.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
