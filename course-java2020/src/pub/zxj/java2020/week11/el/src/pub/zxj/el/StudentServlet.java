package pub.zxj.el;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Jaime
 */
@WebServlet(name = "StudentServlet", urlPatterns = "/info1")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        Student stu = new Student();
        stu.setName("Jaime");
        stu.setMobile(null);
        String grade = "A";
        request.setAttribute("student", stu);
        request.setAttribute("grade", grade);
        request.getRequestDispatcher("/el_info.jsp").forward(request, response);
    }

}
