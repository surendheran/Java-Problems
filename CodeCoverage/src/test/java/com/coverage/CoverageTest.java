package com.coverage;

import org.junit.Test;

public class CoverageTest {

	CoverageDemo demo = new CoverageDemo();
	
	@Test
	public void testPrint(){
		demo.print("Test");
	}
	
	/*@Test
	public void noTestPrint(){
		demo.print("est");
	}*/

}
