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
public class FrontControllerTest {
	
	public FrontControllerTest() {
	}
	/**
	 * Test of dispatchRequest method, of class FrontController.
	 */
	@Test
	public void testDispatchRequest() {
		String request = "";
		String usuario = "admin";
		String contraseña = "admin";
		FrontController instance = new FrontController();
		// TODO review the generated test code and remove the default call to fail.
		if(!instance.isAuthenticUser( usuario, contraseña)){
			fail("The test case is a prototype.");
		}	
	}
	
}
