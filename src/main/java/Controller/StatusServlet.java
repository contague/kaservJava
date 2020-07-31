package Controller;

import Model.Entity.*;
import Model.MakingData.GetStatus;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet(urlPatterns = "status")
public class StatusServlet extends HttpServlet {
    Gson gson = new Gson();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("UTF-8");
            String surname = req.getParameter("surname");
            String number = req.getParameter("number");
            System.out.println(surname + " " + number);

            HashMap map = new GetStatus().getMap(number, surname);
            System.out.println(map + " в сервлете");

            if (map != null){
                StatusEntity entity = new StatusEntityCreation().createEntity(map);
                String json = this.gson.toJson(entity);

                resp.setCharacterEncoding("UTF-8");
                resp.setContentType("application/json");
                PrintWriter out = resp.getWriter();
                out.print(json);
                out.flush();
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

