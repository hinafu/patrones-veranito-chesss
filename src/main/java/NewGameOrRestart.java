/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larrysbarretot
 */
public class NewGameOrRestart implements Order{
	
	@Override
	public void execute() {
		ChessGameEngine.getInstance().reset();
	}

	@Override
	public String name() {
		return "New Game/Restart";
	}
	
}
