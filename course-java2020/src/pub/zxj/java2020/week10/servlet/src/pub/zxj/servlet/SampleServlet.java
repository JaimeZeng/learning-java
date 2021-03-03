package pub.zxj.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Jaime
 */
public class SampleServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String method = req.getMethod();
        String name = req.getParameter("name");
        String mobile = req.getParameter("mobile");
        String sex = req.getParameter("sex");
        String[] spec = req.getParameterValues("spec");
        StringBuilder specs = new StringBuilder();
        for (String value : spec) {
            specs.append(value).append(" ");
        }
        // 向浏览器输出的数据流
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<ul><li>method = " + method + "</li><li>name = " + name + "</li>" +
                "<li>mobile = " + mobile + "</li><li>sex = " + sex + "</li>" +
                "<li>spec = " + specs + "</li></ul>");
        out.println("<a href = 'https://www.baidu.com/'>Baidu</a>");
    }
}
