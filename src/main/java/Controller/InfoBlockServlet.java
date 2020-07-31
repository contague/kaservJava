package Controller;

import Model.Entity.InfoBlockElementEntity;
import Model.Entity.InfoBlockEntity;

import Model.MakingData.GetInfoBlock;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = "infoBlock")
public class InfoBlockServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");

        try {
            ArrayList<InfoBlockElementEntity> infoList = new ArrayList<InfoBlockElementEntity>();
            Gson gson = new Gson();
            GetInfoBlock infoBlock = new GetInfoBlock();
            ArrayList<String[]> list = infoBlock.getList(Integer.parseInt(id), null, null, null, null);
            for (int i = 0; i < list.size(); i++){
                InfoBlockElementEntity infoBlockElementEntity = new InfoBlockElementEntity(list.get(i)[0], list.get(i)[1], list.get(i)[2]);
                infoList.add(infoBlockElementEntity);
            }

            InfoBlockEntity entity = new InfoBlockEntity(infoList);
            String json = gson.toJson(entity);

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