package junitExamples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UseCalculator {
	Calculator c = new Calculator();
	
	@Before
	public void getGreet() {
		System.out.println("Welcome All");
	}
	@Test
	public void getAdd() {
		System.out.println(c.add(5, 5));
	}
	@Test
	public void getSub() {
		System.out.println(c.sub(10, 5));
	}
	@Test
	public void getMul() {
		System.out.println(c.mul(5, 2));
	}
	@Test
	public void getDiv() {
		System.out.println(c.div(10, 2));
	}
	@Test
	public void getMod() {
		System.out.println(c.mod(5, 2));
	}
	@After
	public void getEnd() {
		System.out.println("The End");
	}

}
