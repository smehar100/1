package hello;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit {
	

	@Test
	//@Ignore
	public void test1(){
		ForTesting obj = new ForTesting();
		int a[] = new int[3];
		System.out.println(a.length);
	        assertEquals(15,obj.add(10, 5));
	        
	}
	@Test

	public void test2(){
		ForTesting obj = new ForTesting();
	        assertEquals(12,obj.add(10, 5));
	        assertEquals(12,obj.add(10, 5));
	}
	@Test
	public void test3(){
		ForTesting obj = new ForTesting();
	        assertEquals("JUNIT",obj.name());
	}
/*	@Before
	public void before(){
		System.out.println("before");
	}
	@After
	public void after(){
		System.out.println("after");
	}
	@BeforeClass
	public  static void beforeClass(){
		System.out.println("@BeforeClass");
	}
	@AfterClass
	public static void  afterClass(){
		System.out.println("@AfterClass");
	}*/
	
	@Test
	public void tesingq(){
		ForTesting obj = new ForTesting();
		//obj.sub(10,8);
		assertEquals(2, obj.sub(10,8));
		
	}
}
