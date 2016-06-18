package sanityTest;

import org.testng.annotations.Test;

public class NewTest4 {
  @Test
  public void testCase1() {
	  long id= Thread.currentThread().getId();
	  System.out.println("Thread id is : "+id);
	  System.out.println("Test case 1 is successful");
  }
  @Test
  public void testCase2() {
	  long id= Thread.currentThread().getId();
	  System.out.println("Thread id is : "+id);
	  System.out.println("Test case 2 is successful");
  }
  @Test
  public void testCase3() {
	  long id= Thread.currentThread().getId();
	  System.out.println("Thread id is : "+id);
	  System.out.println("Test case 3 is successful");
  }
  
}
