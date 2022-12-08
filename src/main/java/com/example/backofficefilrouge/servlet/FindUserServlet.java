package com.example.backofficefilrouge.servlet;

import com.example.backofficefilrouge.Dao.UserDao;
import com.example.backofficefilrouge.Dao.UserDaoJpa;
import com.example.backofficefilrouge.entity.UsersEntity;
import com.example.backofficefilrouge.factory.DaoFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


//@WebServlet(name = "UserProfilServlet", value = FindUserServlet.URL)
//public class FindUserServlet extends HttpServlet {
//
//    public static final String URL = "/user";
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String firstLetter = request.getParameter("rechercher");
//
//        UserDaoJpa userDao = new UserDaoJpa()
//        List<UsersEntity> userList = userDao.findByFirstLetterName();
//
//        List<UsersEntity> usersActives = userList.stream().filter(user -> user.getIsActive() == 0).collect(Collectors.toList());
//        System.out.println(usersActives);
//        request.setAttribute("users", userList);
//        request.setAttribute("usersActives", usersActives);
//        request.getRequestDispatcher("/WEB-INF/user.jsp").forward(request, response);
//    }
//
//}
