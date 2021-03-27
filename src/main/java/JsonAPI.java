import java.io.FileReader;
import javax.swing.ImageIcon;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo
 */
public class JsonAPI {

    Object list;
    String img;
    String _c;
    JSONParser p;
    JSONObject data;

    public JsonAPI(){
        
    }

    public ImageIcon createImageByPieceType(int pieceColor) {

        try {
             p = new JSONParser();
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        _c = trace[3].getClassName();
        System.out.println();
        this.img = "chessImages/default-Unassigned.gif";

            Object obj = p.parse(new FileReader(getClass().getResource("colordata/colores.json").getFile()));
            System.out.println(obj);
            JSONObject jsonObject = (JSONObject) obj;
            Object list = jsonObject.get(_c);
            System.out.println(list);
             data= (JSONObject) list;
            System.out.println(data);
            System.out.println(pieceColor);
            this.img = String.valueOf(data.get(String.valueOf(pieceColor)));
            System.out.println(img);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return new ImageIcon(getClass().getResource(img));
    }
}
