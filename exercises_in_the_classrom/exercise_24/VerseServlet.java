package exercises_in_the_classrom.exercise_24;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/verse")
public class VerseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
//            String path = "web/verse.html";
//            ServletContext servletContext = getServletContext();
//            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
//            requestDispatcher.forward(req, resp);

            getServletContext().getRequestDispatcher("/verse").forward(req, resp);

//            getServletContext().getRequestDispatcher("/verse.html").include(req, resp);
        }catch (ServletException e){
            throw new RuntimeException(e);
        }
    }
}
