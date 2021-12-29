package RestAPI.Example;

import org.testng.annotations.Test;

public class TearDown {
	@Test
	  public void TearDownMethod() {
		  System.out.println("Tear Down method invoked");
	  }

}
