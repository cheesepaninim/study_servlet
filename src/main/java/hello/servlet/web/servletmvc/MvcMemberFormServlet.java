package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";

        // req.getRequestDispatcher : Controller → View 로 이동 할 때 사용
        RequestDispatcher dispatcher = req.getRequestDispatcher(viewPath);
        // 서버 내부에서 다시 호출이 발생한다. (서버 내에서의 이동(O) redirect(X))
        dispatcher.forward(req, res);
    }
}
