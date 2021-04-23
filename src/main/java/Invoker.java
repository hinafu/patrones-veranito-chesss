
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larrysbarretot
 */
public class Invoker {
	private Map<String, Order> orders;
	
	public Invoker() {
		this.orders = new HashMap();
	}
	
	public void add(Order order) {
		this.orders.put(order.name(), order);
	}
	
	public void execute(String key) {
		this.orders.get(key).execute();
	}
	
	public String[] keys() {
		return this.orders.keySet().toArray(new String[0]);
	}
}
