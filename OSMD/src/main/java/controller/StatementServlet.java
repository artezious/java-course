package controller;

import dao.StatementDAO;
import dao.UserDAO;
import model.StatementEntity;
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
public class StatementServlet extends HttpServlet{

    private static final long serialVersionUID = 315308419458263751L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        StatementDAO statementDAO = new StatementDAO();
        List<StatementEntity> statements = statementDAO.getStatement();
        writer.write("<html>");
        writer.write("<body>");
        writer.write("<table border='2'>");

        for (StatementEntity statement : statements) {
            writer.write("<tr>");
                writer.write("<td>");
                writer.write("" + statement.getId());
                writer.write("</td>");
                writer.write("<td>");
                writer.write(Double.toString(statement.getDebt()));
                writer.write("</td>");
            writer.write("</tr>");
        }
        writer.write("</table>");
        writer.write("</body>");
        writer.write("</html>");

    }
}
