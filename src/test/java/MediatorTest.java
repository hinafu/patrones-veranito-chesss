/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author middl
 */
public class MediatorTest {
	
	public MediatorTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of getCorrectPiece method, of class Mediator.
	 */
	@Test
	public void testGetCorrectPiece() {
		System.out.println("getCorrectPiece");
		ChessGameBoard gb = null;
		int i = 0;
		int j = 0;
		Mediator instance = new Mediator();
		ChessGamePiece expResult = null;
		ChessGamePiece result = instance.getCorrectPiece(gb, i, j);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
