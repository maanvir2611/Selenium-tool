package sanityTest;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
@BeforeTest 
public void login(){
	System.out.println("Login Successfully");
}
@AfterTest
public void logout(){
	System.out.println("Logout successfully");
}
@Test
public void addProduct(){
	System.out.println("Add product successfully");
}
@Test(priority = 1)
public void addVendor(){
	System.out.println("Add vendor successfully");
}
@Test
public void addCurrency(){
	System.out.println("Add currency successfully");
}
}
