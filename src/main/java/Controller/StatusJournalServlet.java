package Controller;

import Model.Entity.JournalEntity;
import Model.MakingData.GetJournal;
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

@WebServlet(urlPatterns = "statusJournal")
public class StatusJournalServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstDate = req.getParameter("firstDate");
        String secondDate = req.getParameter("secondDate");
        String option = req.getParameter("option");
        HttpSession session = req.getSession();
        String login = (String) session.getAttribute("login");

        ArrayList list = new GetJournal().getList(0, firstDate, secondDate, option, login);
        Gson gson = new Gson();
        JournalEntity entity = new JournalEntity(list);
        String json = gson.toJson(entity);

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.print(json);
        out.flush();
    }
}
