/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larrysbarretot
 */
public class Turn {
	private int value;
	
	public Turn() {
		this.value = 0;
	}
	
	public int hisTurn() {
		int result = this.value;
		this.value = this.change();
		return result;
	}
	
	public int change() {
		return (this.value + 1) % 2;
	}
	
	public int notTurn() {
		return this.change();
	}
	
	public String toString() {
		return "" + (this.value + 1);
	}
}
