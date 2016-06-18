package sanityTest;

import org.testng.annotations.Test;

public class NewTest5 {
	@Test
	  public void testCase4() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Thread id is : "+id);
		  System.out.println("Test case 4 is successful");
	  }
	  @Test
	  public void testCase5() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Thread id is : "+id);
		  System.out.println("Test case 5 is successful");
	  }
	  @Test
	  public void testCase6() {
		  long id= Thread.currentThread().getId();
		  System.out.println("Thread id is : "+id);
		  System.out.println("Test case 6 is successful");
	  }
}
