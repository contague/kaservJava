package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

@RestController
public class ImgController {

    @GetMapping("statusImage")
    public void imgOutput(@RequestParam("path") String path, HttpServletResponse resp) throws Exception{
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
