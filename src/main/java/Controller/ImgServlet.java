package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(urlPatterns = "statusImage")
public class ImgServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getParameter("path");
        String resultPath = java.net.URLDecoder.decode(path);
        File file = new File(resultPath);
        System.out.println(file);
        FileInputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = resp.getOutputStream();
        resp.setContentType("image/jpg");
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0){
            outputStream.write(buffer, 0, length);
        }
    }
}
