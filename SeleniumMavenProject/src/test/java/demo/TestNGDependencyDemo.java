package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnMethods = {"test2","test3"})
	public void test1() {
		System.out.println("I am inside test 1");
	}
	@Test(groups = {"sanity1"})
	public void test2() {
		System.out.println("I am inside test 2");
	}
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
	}
	@Test(dependsOnGroups =  {"sanity1"})
	public void test4() {
		System.out.println("I am inside test 4");
	}
}