package Controller;

import Model.Entity.MenuElementEntity;
import Model.Entity.MenuEntity;
import Model.MakingData.GetDinamicMenu;
import Model.MakingData.GetStatus;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = "menu")
public class MenuServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String role = (String) session.getAttribute("role");
        if (role == null){
            session.setAttribute("role", "guest");
            session.setAttribute("idAccount", "0");
            session.setAttribute("idAccount", "0");
        }
        role = (String) session.getAttribute("role");

        String idAccount = (String) session.getAttribute("idAccount");
        String idGroupUser = (String) session.getAttribute("idGroupUser");

        try {
            Gson gson = new Gson();
            ArrayList<MenuElementEntity> outputList = new ArrayList<MenuElementEntity>();
            ArrayList<String[]> list = new GetDinamicMenu().getMenu(role, idAccount, idGroupUser);
            for (int i = 0; i < list.size(); i++){
                String[] element = list.get(i);
                MenuElementEntity menuElement = new MenuElementEntity(element[0], element[1],
                        element[2], element[3], element[4], element[5], element[6], element[7]);
                outputList.add(menuElement);
            }

            MenuEntity menu = new MenuEntity(outputList);
            String json = gson.toJson(menu);

            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("application/json");

            PrintWriter out = resp.getWriter();
            out.print(json);
            out.flush();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}