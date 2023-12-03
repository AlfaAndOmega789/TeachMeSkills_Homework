package all_homework.homework_22.task_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.TimeZone;

@WebServlet("/minsk")
public class MinskServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Belarus"));
        String date = String.valueOf(new Date());

        resp.setContentType("text/html");
        try(PrintWriter writer = resp.getWriter()){
            writer.write("<h2>" + date + "</h2>");
            String id = req.getParameter("id");
            System.out.println("1");
            System.out.println(id);
        }
    }
}
