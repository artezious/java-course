package com;

import javax.persistence.Entity;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class UserServlet extends HttpServlet {

    private static final long serialVersionUID = -3768680688366571301L;

    List usersDB = new ArrayList();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("name", "Федя");
        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String surName = req.getParameter("surnameUI");
        String name = req.getParameter("nameUI");
        String id = req.getParameter("idUI");

        User user = new User (Integer.valueOf(id), surName, name );
        usersDB.add(user);

        req.setAttribute("usersList", usersDB);
        req.getRequestDispatcher("index.jsp").forward(req,resp);

/*        PrintWriter writer = resp.getWriter();
        writer.println(usersDB);*/
    }
}
