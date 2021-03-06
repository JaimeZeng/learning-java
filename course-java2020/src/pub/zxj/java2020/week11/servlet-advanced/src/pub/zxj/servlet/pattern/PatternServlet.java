package pub.zxj.servlet.pattern;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Jaime
 */
@WebServlet("/pattern/*")
public class PatternServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String url = req.getRequestURI();
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("url: " + url + "<br/>");
        String uid = url.substring(url.lastIndexOf("/") + 1);
        out.println(uid + " - ");
        switch (uid) {
            case "1":
                out.println("Jaime" + "<br/>");
                break;
            case "6":
                out.println("RyanJie" + "<br/>");
                break;
            default:
                out.println("Other" + "<br/>");
        }
    }
}
