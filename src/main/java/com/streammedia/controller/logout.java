package com.streammedia.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The type Logout.
 * @author Jeanne
 * @version  1.0
 * @since 2020-03-02
 */
@WebServlet(name = "logoutServlet", urlPatterns = {"/logout"})
public class logout extends HttpServlet{
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        // Invalidate current HTTP session.
        // Will call  LoginModule logout() method
        request.getSession().invalidate();

        // Redirect the user to the secure web page.
        // Since the user is now logged out the
        // authentication form will be shown
        response.sendRedirect(request.getContextPath());

    }
}
