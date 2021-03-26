package com.lti.testcode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.code.LoginService;

public class LoginServiceTest {

	@Test
	public void testCase1() {
		//fail("Not yet implemented");
		LoginService loginService= new LoginService();
		boolean validOrNot= loginService.isValidUser("rituraj", "111");
		boolean expected= false;
		assertEquals(expected, validOrNot);
	}
	@Test
	public void testCase2() {
		LoginService loginService= new LoginService();
		boolean validOrNot= loginService.isValidUser("rituraj", "123");
		boolean expected= true;
		assertEquals(expected, validOrNot);
	}
	
	@Test
	public void testCase3() {
		LoginService loginService= new LoginService();
		boolean validOrNot= loginService.isValidUser("Rituraj", "123");
		boolean expected= true;
		assertEquals(expected, validOrNot);
	}
	
	

}
