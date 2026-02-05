import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SetCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie cookie = new Cookie("username", "Kunal");
        cookie.setMaxAge(60*60); // 1 hour

        response.addCookie(cookie);
        response.sendRedirect("showCookie.jsp");
    }
}
