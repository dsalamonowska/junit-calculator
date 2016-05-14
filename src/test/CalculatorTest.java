package test;

import main.Calculator;

import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void test1() throws Exception {
		System.out.println("Metoda testowa");
		double a = 2.5;
		double b = 3.0;
		
		double wynik = classUnderTest.sum(a, b);
		
		assertEquals(5.5, wynik, 0.001);
		
	}
	@Test
	public void testSumowanieTrzech() throws Exception {
		double a = 2.5;
		double b = 3.0;
		double c = 2.0;
		
		double wynik = classUnderTest.sum(a, classUnderTest.sum(b, c));
		assertEquals(7.5, wynik, 0.001);
	}
	@Test
	public void testOdejmowanie() throws Exception {
		double a = 5.5;
		double b = 3.0;
		
		double wynik = classUnderTest.subtract(a, b);
		assertEquals(2.5, wynik, 0.001);
	}
	@Test
	public void testMnozenie() throws Exception {
		double a = 5.0;
		double b = 3.0;
		
		double wynik = classUnderTest.multiply(a, b);
		assertEquals(15.0, wynik, 0.001);
	}
	@Test
	public void testDzielenie() throws Exception {
		double a = 6.0;
		double b = 3.0;
		
		double wynik = classUnderTest.divide(a, b);
		assertEquals(2.0, wynik, 0.001);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDzieleniePrzezZero() throws Exception {
		double a = 6.0;
		double b = 0;
		
		double wynik = classUnderTest.divide(a, b);
		
		//assertEquals(8.0, wynik, 0.001); i tak siê nie wykona.
	}
}
