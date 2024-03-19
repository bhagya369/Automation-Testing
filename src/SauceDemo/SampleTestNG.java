package SauceDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG {
   @Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@BeforeGroups
	public void BeforeClass() {
		System.out.println("before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test");
	}
	
	@Test(priority=1)
	public void test3() {
		System.out.println("test1");
	}
	 
	@Test(priority=-1)
	public void test4() {
		System.out.println("test -1");
	}
	@Test(priority=2)
	public void test5() {
		System.out.println("test 2");
	}
	
	
}




