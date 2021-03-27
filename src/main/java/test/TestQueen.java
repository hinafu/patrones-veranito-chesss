/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import junit.framework.TestCase;

/**
 *
 * @author Carloss
 */
public class TestQueen extends TestCase{
	private Queen queen;
	private ChessGameBoard board;
	public void escenario(){
		queen = new Queen();
	}
	
	public void calculatePossibleMoves (){
		assertTrue(queen.calculatePossibleMoves(board));
	}
}