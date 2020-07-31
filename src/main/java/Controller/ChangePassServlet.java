package Controller;

import Model.Entity.ResultChangePassEntity;
import Model.MakingData.ChangePass;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "changePass")
public class ChangePassServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String newPass = req.getParameter("pass");
        HttpSession session = req.getSession();
        String idCustUser = (String) session.getAttribute("idCustUser");
        boolean result = new ChangePass().changeData(newPass, idCustUser);

        ResultChangePassEntity resultChangePassEntity = new ResultChangePassEntity(result);
        Gson gson = new Gson();
        String json = gson.toJson(resultChangePassEntity);
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.print(json);
        out.flush();
    }
}
