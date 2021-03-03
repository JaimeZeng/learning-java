package pub.zxj.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 0210 编程练习
 * 使用 Servlet 计算 n 以内自然数的累加和，并输出，参数 n 通过 url 地址传递.
 * 提示: 在 Servlet 中获取的参数是字符串类型，需要使用 Integer.parseInt(String s)方法转换为整型再进行计算。
 *
 * @author Jaime
 */
@WebServlet(urlPatterns = "/ComputerServlet")
public class ComputerServlet extends HttpServlet {
    public int accumulation(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String n = req.getParameter("n");
        resp.setContentType("text/html");
        resp.getWriter().println(accumulation(Integer.parseInt(n)));
    }
}
