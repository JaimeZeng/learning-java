package pub.zxj.servlet.charset;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Jaime
 */
@WebServlet("/charset/process")
public class CharsetServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String address = request.getParameter("address");
        String utf8Username = new String(username.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        String utf8Address = new String(address.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("username: " + username + ", address: " + address + "<br/>");
        response.getWriter().println("username: " + utf8Username + ", address: " + utf8Address);
        System.out.println("username: " + username + ", address: " + address);
        System.out.println("username: " + utf8Username + ", address: " + utf8Address);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String address = req.getParameter("address");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("username: " + username + ", address: " + address + "<br/>");
        System.out.println("username: " + username + ", address: " + address);
    }
}
