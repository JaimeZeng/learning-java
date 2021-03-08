package pub.zxj.el;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jaime
 */
@WebServlet(name = "StudentRespServlet")
public class StudentRespServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Student stu = new Student();
        stu.setName("Jaime");
        stu.setMobile(null);
        String grade = "A";
        request.setAttribute("student", stu);
        request.setAttribute("grade", grade);
        response.sendRedirect("/el_war_exploded/el_info.jsp");

    }
}
