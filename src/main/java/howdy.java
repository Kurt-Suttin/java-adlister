import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/howdy")
public class howdy extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws SecurityException, IOException {
        res.getWriter().println("<h1><a href = '/partner'>howdy</a></h1>");
    }
}
