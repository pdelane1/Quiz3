package base;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test_Class {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_getArea() {
		Triangle testTriangle = new Triangle(3.0,4.0,5.0);
		assertTrue(testTriangle.getArea() == 6.0);
		Triangle testTriangle2 = new Triangle(6.0, 8.0, 10.0);
		assertTrue(testTriangle2.getArea() == 24.0);
		Triangle testTriangle3 = new Triangle(30.0,40.0,50.0);
		assertTrue(testTriangle3.getArea() == 600.0);
		Triangle testTriangle4 = new Triangle(60.0,80.0,100.0);
		assertTrue(testTriangle4.getArea() == 2400.0);
	}

	@Test
	public void test_getPerimeter() {
		Triangle testTriangle = new Triangle(3.0,4.0,5.0);
		assertTrue(testTriangle.getPerimeter() == 12.0);
		Triangle testTriangle2 = new Triangle(6.0, 8.0, 10.0);
		assertTrue(testTriangle2.getPerimeter() == 24.0);
		Triangle testTriangle3 = new Triangle(30.0,40.0,50.0);
		assertTrue(testTriangle3.getPerimeter() == 120.0);
		Triangle testTriangle4 = new Triangle(60.0,80.0,100.0);
		assertTrue(testTriangle4.getArea() == 240.0);
	}
}
