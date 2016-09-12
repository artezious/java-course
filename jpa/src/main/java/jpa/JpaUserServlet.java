package jpa;

import com.User;
import jpa.model.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by WEO on 9/9/16.
 */
public class JpaUserServlet extends HttpServlet {

    private static final long serialVersionUID = -4904899770645506768L;

    private UserDAO userDAO = new UserDAO();



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        List<UserEntity> users = userDAO.getUsers();

        writer.write("<html>");
        writer.write("<body>");


            writer.write("<table border='1'>");
                for (UserEntity usr : users) {
                    writer.write("<tr>");
                    writer.write("<td>");
                    writer.write("" + usr.getId());
                    writer.write("</td>");
                    writer.write("<td>");
                    writer.write(usr.getName());
                    writer.write("</td>");
                    writer.write("<td>");
                    writer.write(usr.getSurname());
                    writer.write("</td>");
                    writer.write("</tr>");
                }
            writer.write("</table>");

        writer.write("</body>");
        writer.write("</html>");

    }
}

/*     writer.write("<form method=\"post\" action=\"/web/usersURL\">\n" +
                "    </br>\n" +
                "    <label> Surname: </label> <input type=\"text\" value=\"\" name=\"surnameUI\"/>\n" +
                "    </br>\n" +
                "    <label> Name: </label> <input type=\"text\" value=\"\" name=\"nameUI\"/>\n" +
                "    </br>\n" +
                "    <label> ID: </label> <input type=\"text\" value=\"\" name=\"idUI\"/>\n" +
                "\n" +
                "    <button type=\"submit\"> Add User</button>\n" +
                "</form>");*/