package com.streammedia.controller;
import com.streammedia.entity.*;
import com.streammedia.perisistence.GenericDao;
import lombok.extern.log4j.Log4j2;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * FAQController.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user to display FAQ Details.
 * https://www.javaguides.net/2019/03/jsp-servlet-hibernate-crud-example.html
 * @author Jeanne
 * @version 1.0
 * @since 2020-02-21
 */
@Log4j2
@WebServlet(
        urlPatterns = {"/faq-details"})
public class FAQDetails extends HttpServlet {

    private GenericDao faqDao;
    private GenericDao userDao;

    public void init() {
        faqDao = new GenericDao(FAQ.class);
        userDao = new GenericDao(User.class);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        FAQ faq= (FAQ)faqDao.getById(Integer.parseInt(request.getParameter("uid")));
        log.debug("Getting a Single FAQ " + faq);
        request.setAttribute("faq", faq);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/faq/faqDetails.jsp");
        dispatcher.forward(request, response);
    }
}