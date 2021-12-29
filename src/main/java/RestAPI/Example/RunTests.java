package RestAPI.Example;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunTests {
  public static void main(String[] args) {
	  while(true)
      {
          List<String> suites = new ArrayList<String>();
          suites.add("createdata.xml");
          suites.add("deletedata.xml");
          suites.add("getdata.xml");

          TestNG tng = new TestNG();
          tng.setTestSuites(suites);

          tng.run(); //run test suite
      }
  }
}
