package all_homework.homework_22.task_2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

@WebServlet("/checkAge") //http://localhost:8082/checkAge?age=20
public class AgeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String age = req.getParameter("age");

        if(age != null && !age.isEmpty()){
            try {
                int age1 = Integer.parseInt(age);
                boolean isAdult;
                isAdult = age1 >= 18;

                String result = isAdult ? "Совершеннолетний" : "Несовершеннолетний";
                response.getWriter().write(result);
            } catch (NumberFormatException e) {
                response.getWriter().write("Ошибка в формате возраста");
            }
        }
    }
}