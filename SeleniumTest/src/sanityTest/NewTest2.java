package sanityTest;



import org.testng.annotations.Test;

public class NewTest2 {
	/*@BeforeClass 
	public void login(){
		System.out.println("Login Successfully");
	}
	@AfterClass
	public void logout(){
		System.out.println("Logout successfully");
	}*/
	@Test
	public void deleteProduct(){
		System.out.println("Delete product successfully");
	}
	@Test(priority = 1)
	public void deleteVendor(){
		System.out.println("Delete vendor successfully");
	}
	@Test
	public void deleteCurrency(){
		System.out.println("Delete currency successfully");
	}
}
