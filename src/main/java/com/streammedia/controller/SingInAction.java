package com.streammedia.controller;
import lombok.extern.log4j.Log4j2;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * The type Sing in action.
 * A simple servlet whose purpose is to redirect
 * after a log in attempt
 *https://stackoverflow.com/questions/1531197/how-do-i-redirect-to-the-current-page-in-servlet-filter
 * @author Jeanne
 * @version 1.0
 * @since 2020-03-02
 */
@WebServlet(
        urlPatterns = {"/login"}
)
@Log4j2
public class SingInAction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("user-profile");
    }
}
