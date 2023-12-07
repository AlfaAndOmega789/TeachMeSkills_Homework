package all_homework.homework_23.task_2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/load-book")
public class UploadBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Логика загрузки книги на сервер
        // Например, сохранение файла на сервере

        String uploadDirectory = "TeachMeSkills_Homework\\all_homework\\homework_23\\task_2\\"; // Укажите путь для сохранения загруженных книг
        Part filePart = request.getPart("file");

        try (InputStream fileContent = filePart.getInputStream();
             OutputStream outputStream = new FileOutputStream(
                     new File(uploadDirectory, getSubmittedFileName(filePart)))) {
            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = fileContent.read(buffer, 0, buffer.length)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }

        response.getWriter().println("Книга успешно загружена на сервер.");
    }

    private String getSubmittedFileName(Part part) {
        String header = part.getHeader("content-disposition");
        for (String token : header.split(";")) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return "unknown";
    }
}

