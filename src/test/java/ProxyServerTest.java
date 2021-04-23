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
 * @author Carloss
 */
public class ProxyServerTest {
	
	public ProxyServerTest() {
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
	 * Test of Accediendo method, of class ProxyServer.
	 */
	@Test
	public void testAccediendo() {
		System.out.println("Accediendo");
		String usuario = "";
		ProxyServer instance = null;
		instance.Accediendo(usuario);
		// TODO review the generated test code and remove the default call to fail.
			fail("The test case is a prototype.");
		
		
	}

	/**
	 * Test of isRestricted method, of class ProxyServer.
	 */
	@Test
	public void testIsRestricted() {
		System.out.println("isRestricted");
		String usuario = "";
		ProxyServer instance = null;
		boolean expResult = false;
		boolean result = instance.isRestricted(usuario);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
