package pub.zxj.servlet.practice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jaime
 */
@WebServlet("/practice/sum")
public class SumServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num = Integer.parseInt(request.getParameter("num"));
        int sum = num * (num + 1) / 2;
        request.getRequestDispatcher("/practice/sum_display?num=" + num + "&sum=" + sum).forward(request, response);
        // response.sendRedirect("/servlet_advanced_war_exploded/practice/sum_display?num=" + num + "&sum=" + sum");
    }
}
