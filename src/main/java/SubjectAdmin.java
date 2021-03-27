/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carloss
 */
public class SubjectAdmin implements Subject{
	
	@Override
  public void doOperation(String username) {
    System.out.println("Soy un ADMIN");
  }
	
}
