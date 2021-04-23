import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
import java.io.FileReader;

public class PieceUI {
	public ImageIcon createImageByPieceType(int pieceColor) {
		JSONParser p = new JSONParser();
		StackTraceElement[] trace = Thread.currentThread().getStackTrace();
		String _c = trace[3].getClassName();
		String img = "chessImages/default-Unassigned.gif";
		
		try {
			Object obj = p.parse(new FileReader(getClass().getResource("colordata/colores.json").getFile()));
			JSONObject jsonObject = (JSONObject) obj;
			Object list = jsonObject.get(_c);
			JSONObject data = (JSONObject) list;
			
			img = String.valueOf(data.get(String.valueOf(pieceColor)));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		return new ImageIcon(getClass().getResource(img));
	}
}
