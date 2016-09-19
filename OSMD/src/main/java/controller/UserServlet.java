package controller;

import dao.UserDAO;
import model.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by WEO on 9/12/16.
 */

public class UserServlet extends HttpServlet{
    private static final long serialVersionUID = -4027159295798624286L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        UserDAO userDAO = new UserDAO();
        List<UserEntity> users = userDAO.getUsers();

        writer.write("<!DOCTYPE html>");
        writer.write("<html>");
        writer.write("<body>");
        writer.write("<table border='2'>");

        for (UserEntity user : users) {
            writer.write("<tr>");
                writer.write("<td>");
                writer.write("" + user.getId());
                writer.write("</td>");
                writer.write("<td>");
                writer.write(user.getName());
                writer.write("</td>");
                writer.write("<td>");
                writer.write(user.getSurname());
                writer.write("</td>");
                writer.write("<td>");
                writer.write(user.getAddress());
                writer.write("</td>");
                writer.write("<td>");
                writer.write(user.getTelephone());
                writer.write("</td>");
                writer.write("<td>");
                writer.write(user.getEmail());
                writer.write("</td>");
            writer.write("</tr>");
        }
        writer.write("</table>");
        writer.write("</body>");
        writer.write("</html>");

    }
}
