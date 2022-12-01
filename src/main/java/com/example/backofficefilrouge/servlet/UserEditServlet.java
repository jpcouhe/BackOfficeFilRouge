package com.example.backofficefilrouge.servlet;


import com.example.backofficefilrouge.Dao.UserDao;
import com.example.backofficefilrouge.entity.UserrEntity;
import com.example.backofficefilrouge.factory.DaoFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;


@WebServlet(name = "UserEditServlet", value = "/user/edit")
public class UserEditServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao<UserrEntity> userDao = DaoFactory.getUserDao();

        String idUser = req.getParameter("id");
        Optional<UserrEntity> user = userDao.findById(Integer.parseInt(idUser));

        if(user.isPresent()){
            req.setAttribute("user", user.get());
            req.getRequestDispatcher("/WEB-INF/edit-user.jsp").forward(req, resp);
        }
        else {
            System.out.println("Error 404");

        }
}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
