import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Create or retrieve session
        HttpSession session = request.getSession();

        // Set attributes
        session.setAttribute("username", "Kunal");
        session.setAttribute("role", "student");

        // Redirect to JSP to show session
        response.sendRedirect("showSession.jsp");
    }
}
