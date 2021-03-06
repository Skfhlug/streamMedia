package com.streammedia.controller;

import com.streammedia.RestApi.*;
import com.streammedia.perisistence.APIMovieDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(
        urlPatterns = {"/now-playing-movies"}
)
public class NowPlayingMovies extends HttpServlet {
    private APIMovieDao apiMovieDao;
    @Override
    public void init() throws ServletException {
        apiMovieDao =  new APIMovieDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ResultsItem> items = new ArrayList<>();
        for ( APIMoviesDB item: apiMovieDao.getPlayingMovies()) {
            for (ResultsItem movie: item.getResults()) {
                items.add(movie);
            }
        }
        req.setAttribute("movies", items);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/film/nowPlayingMovies.jsp");
        dispatcher.forward(req,resp);
    }
}

