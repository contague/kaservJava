package Model.MakingData;

import java.io.File;

public class GetImages {
    public String[] getImg(String sn, String brand, String month){
        String path = "C://FotoPhone/1/OtkazVGO" + "/" + brand + "/" + month + "/" + sn;
        String[] dirList;
        File dir = new File(path);
        if (dir.exists()) {
            File[] list = dir.listFiles();
            dirList = new String[list.length];
            for (int i = 0; i < list.length; i++) {
                dirList[i] = list[i].toString();
            }
            return dirList;
        }
        else
            return null;

    }
}
