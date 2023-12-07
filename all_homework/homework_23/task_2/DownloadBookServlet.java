package all_homework.homework_23.task_2;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book")
public class DownloadBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String bookPath = "TeachMeSkills_Homework\\all_homework\\homework_23\\task_2\\Фьючерсы .pdf";
        File bookFile = new File(bookPath);

        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=" + bookFile.getName());

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(bookFile));
             BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream())) {
            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = in.read(buffer, 0, buffer.length)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }
}

