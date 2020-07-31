package Controller;

import Model.Entity.LoginEntity;
import Model.MakingData.GetLogin;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet(urlPatterns = "login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("log");
        String pass = req.getParameter("pass");

        GetLogin getLogin = new GetLogin();
        if(getLogin.getMap(pass, login) != null) {
            HttpSession session = req.getSession();
            HashMap<String, String> map = getLogin.getMap(pass, login);
            session.setAttribute("role", map.get("role"));
            session.setAttribute("idAccount", map.get("idAccount"));
            session.setAttribute("idGroupUser", map.get("idGroupUser"));
            session.setAttribute("idCustUser", map.get("idCustUser"));
            session.setAttribute("login", login);
        }

        HttpSession session = req.getSession();
        String role = (String) session.getAttribute("role");
        LoginEntity entity = new LoginEntity(role);
        Gson gson = new Gson();
        String json = gson.toJson(entity);
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.print(json);
        out.flush();
    }


}
