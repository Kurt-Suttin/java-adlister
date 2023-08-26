import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/partner")
public class partner extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws SecurityException, IOException {

        String name = req.getParameter("name");
        if (name != null) {
            res.getWriter().println("<h1>" + name + "</h1>");
        } else res.getWriter().println("<h1>Partner</h1>");

    }


}
