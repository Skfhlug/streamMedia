package com.streammedia.controller;
import com.streammedia.entity.*;
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
     * BookList.java
     * This servlet acts as a page controller for the application, handling all
     * requests from the user to perform CRUD operations.
     * https://www.javaguides.net/2019/03/jsp-servlet-hibernate-crud-example.html
     * @author Jeanne
     * @version 1.0
     * @since 2020-03-03
     */
    @Log4j2
    @WebServlet("/books")
    public class BookList extends HttpServlet {
    private GenericDao bookDao;

        public void init(){
            bookDao =  new GenericDao(Book.class);
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
//            String action = request.getServletPath();
            List<Book> bookList =  bookDao.getAll();
            log.debug(bookList.size());
            request.setAttribute("books",bookList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/book/bookList.jsp");
            dispatcher.forward(request, response);
        }
}
