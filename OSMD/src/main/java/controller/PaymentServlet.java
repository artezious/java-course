package controller;

import dao.PaymentDAO;
import dao.UserDAO;
import model.PaymentEntity;
import model.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by WEO on 9/12/16.
 */
public class PaymentServlet extends HttpServlet{


    private static final long serialVersionUID = -9128835005378744789L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        PaymentDAO paymentDAO = new PaymentDAO();
        List<PaymentEntity> payments = paymentDAO.getPayment();
        writer.write("<html>");
        writer.write("<body>");
        writer.write("<table border='2'>");

        for (PaymentEntity payment : payments) {
            writer.write("<tr>");
                writer.write("<td>");
                writer.write("" + payment.getId());
                writer.write("</td>");
                writer.write("<td>");
                writer.write(Double.toString(payment.getPaid()));
                writer.write("</td>");
                writer.write("<td>");
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                writer.write(dateFormat.format(payment.getPaymentDate()));
                writer.write("</td>");
            writer.write("</tr>");
        }
        writer.write("</table>");
        writer.write("</body>");
        writer.write("</html>");

    }
}
