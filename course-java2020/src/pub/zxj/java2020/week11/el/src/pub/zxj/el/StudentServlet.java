package pub.zxj.el;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * pageScope < requestScope < sessionScope < applicationScope
 *
 * @author Jaime
 */
@WebServlet(name = "StudentServlet", urlPatterns = "/info1")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        Student stu = new Student();
        stu.setName("Jaime");
        stu.setMobile("13868688686");
        String grade = "A"; //session
        request.setAttribute("grade", "B"); //request
        request.getServletContext().setAttribute("grade", "C"); //application
        HttpSession session = request.getSession();
        session.setAttribute("student", stu);
        session.setAttribute("grade", grade);
        request.getRequestDispatcher("/el_info.jsp?teacher=poppy").forward(request, response);
    }

}
