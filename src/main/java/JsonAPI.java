
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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

    public JsonAPI(){
    

    }
public ImageIcon createImageByPieceType(int pieceColor) {
		JSONParser p = new JSONParser();
		StackTraceElement[] trace = Thread.currentThread().getStackTrace();
		String _c = trace[4].getClassName();
		String img = "chessImages/default-Unassigned.gif";
		try {
			Object obj = p.parse(new FileReader(getClass().getResource("colordata/colores.json").getFile()));
                        JSONObject jsonObject = (JSONObject) obj;
			                 System.out.println(jsonObject);
                        Object list = jsonObject.get(_c);
			JSONObject data = (JSONObject) list;

			img = String.valueOf(data.get(String.valueOf(pieceColor)));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		return new ImageIcon(getClass().getResource(img));
	}
}
