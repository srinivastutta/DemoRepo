package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void Logintest(){
		System.out.println("Login Test");
	}
	@Test
	public void Logintest1(){
		System.out.println("Login Test2");
	}
	@Test
	public void Logintest2(){
		System.out.println("Login Test2");
		Assert.assertTrue(false);
	}
}
