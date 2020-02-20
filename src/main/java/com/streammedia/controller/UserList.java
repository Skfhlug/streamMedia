package com.streammedia.controller;
import com.streammedia.entity.User;
import com.streammedia.perisistence.GenericDao;
import lombok.extern.log4j.Log4j2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * The type Users.
 */

@Log4j2
@WebServlet(
        name = "users",
        urlPatterns = {"/users"})
public class UserList extends HttpServlet {
//    private UserDao userDao;
    GenericDao genericDao;

    public void init() {

//        userDao = new UserDao();
        genericDao =  new GenericDao(User.class);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<User> listUser = genericDao.getAll();
        log.debug("Getting All Users servlet" + listUser);
        request.setAttribute("users", listUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/account/listUser.jsp");
        dispatcher.forward(request, response);
    }


}