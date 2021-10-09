package demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TesstNGParametersDemo {

	@Test
	@Parameters({"Prudhvi"})
	public void test(String name) {
		System.out.println("My name is : "+name);
		
	}
}
