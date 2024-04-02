package homework_26;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveRequestServlet")
public class SaveRequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        if (name == null || email == null || message == null || name.isEmpty() || email.isEmpty() || message.isEmpty()) {
            response.sendRedirect("save-request.jsp");
            return;
        }

        response.sendRedirect("success.jsp");
    }
}

