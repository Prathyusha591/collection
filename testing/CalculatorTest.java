package com.codegnan.testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {

	private Calculator calculator;
	@BeforeAll
	public void setupAll() {
		System.out.println("@BeforeAll-> initialize global resources(eg..DB Connection)");
	}
	@AfterAll
	public void downAll() {
		System.out.println("@AfterAll-> clean up global resources (eg.. Close DB Connection)");
		
	}
@BeforeEach
public void setup() {
	calculator=new Calculator();
	System.out.println("BeforeEach-> Create fresh calculator object");
	
}
@AfterEach
public void tearDown() {
	System.out.println("@AfterEach-> clean up after test");
}
@Test
public void testAddition() {
	assertEquals(5,calculator.add(2, 3));
}
@Test
public void testsubtract() {
	assertEquals(-10,calculator.add(-30, -20));
}
	@Test
	@Disabled("not implemented yet- division by negative numbers")
	void testDivisionNegativeNumbers() {
		assertEquals(-2, calculator .divide(4, -2));
	}
	@ParameterizedTest
    @ValueSource(ints= {2,4,6,8})
    @DisplayName("Parameterized Test -Even Numbers chesk")
    void testIsEven(int number) {
    	assertEquals(0,number %2,number+"Should be Even");
    }
    @RepeatedTest(3)
    @DisplayName("Reapeted Test multiplication")
    void testMultiplicationRepeted() {
    	assertEquals(12,calculator.multiply(4, 3));
    }
    @Test
    @Tag("fast")
    @DisplayName("Tagged Test -subtraction")
    void testSubtraction() {
    	assertEquals(1,calculator.subtract(5, 4));
    }
	
}



