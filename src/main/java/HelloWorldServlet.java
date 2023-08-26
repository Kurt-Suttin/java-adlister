import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws SecurityException, IOException {
        HttpSession session = req.getSession(true);

        String resetParam = req.getParameter("reset");
        if (resetParam != null && resetParam.equals("true")) {
            session.setAttribute("count", 0);
            return;
        }

        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 1;
        } else {
            count++;
        }

        session.setAttribute("count", count);

        res.getWriter().println("<h1>Page View Count: " + count + "</h1>");

        String name = req.getParameter("name");
        if (name != null) {
            res.getWriter().println("<h1> Hello, " + name + "!</h1>");
        } else {
            res.getWriter().println("<h1> Hello, World!</h1>");
        }
    }
}
