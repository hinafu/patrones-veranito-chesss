/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author middl
 */
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class DTO {
	protected List<Map<String, String>> data;
	
	public DTO() {
		this.data = new ArrayList< Map<String, String> >();
		MysqlCon connection = new MysqlCon();
		
		ArrayList<String[]> users = connection.getData();
		users.forEach((lista) -> {
			Map<String, String> aux = new HashMap<String, String>();
			aux.put("user", lista[1]);
			aux.put("pass", lista[2]);
			aux.put("nombre", lista[3]);
			
			this.data.add(aux);
		});
	}
	
	public List<Map<String, String>> getData() {
		return this.data;
	}
}
