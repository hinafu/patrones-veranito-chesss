/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carloss
 */
public class ServerObserver2Test {
	
	public ServerObserver2Test() {
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
	 * Test of actionPerformed method, of class ServerObserver2.
	 */
	@Test
	public void testActionPerformed() {
		System.out.println("actionPerformed");
		ActionEvent e = null;
		ServerObserver2 instance = new ServerObserver2();
		instance.actionPerformed(e);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
