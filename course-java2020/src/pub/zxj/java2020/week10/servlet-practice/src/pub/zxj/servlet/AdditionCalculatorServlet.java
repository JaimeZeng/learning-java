package pub.zxj.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 使用 Servlet 完成加法计算器：
 * 1. 创建一个 html 页面，定义一个表单，点击计算按钮，提交给 Servlet 进行处理
 * 2. 将表单数据传递给 Servlet，并将计算结果打印输出在页面上。
 *
 * @author Jaime
 */
@WebServlet(urlPatterns = "/add_calc")
public class AdditionCalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        resp.setContentType("text/html");
        resp.getWriter().println("Addition Calculator: <br/>calculation results: " + (num1 + num2));
    }
}
