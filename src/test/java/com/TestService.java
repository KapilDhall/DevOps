package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestService {
		
	
	CalculatorService cs = new CalculatorService();
	StringService ss = new StringService();
	
	//Test Case 1
	@Test
	public void testdisplayMessage()
	{
		Assertions.assertEquals("Hello, How are you?", ss.displayMessage("Hello, How are you?"));
		Assertions.assertEquals("Message is blank", ss.displayMessage(""));
	}
	
	//Test Case 2
	@Test
	public void testLengthMessage()
	{
		Assertions.assertNotEquals(0, ss.lengthMessage("Hello"));
		Assertions.assertEquals(5, ss.lengthMessage("Hello"));
	}
	

	//Test Case 3
	@Test
	public void testLowerMessage()
	{
		Assertions.assertNotEquals("HELLO", ss.messageToLower("HELLO"));
		Assertions.assertEquals("hello", ss.messageToLower("HELLO"));
	}
	

	//Test Case 4
	@Test
	public void testConcatMessage()
	{
		Assertions.assertNotEquals("Hello How are you?", ss.messageToConcat("How are you?"));
		Assertions.assertEquals("Hello, How are you?", ss.messageToConcat("How are you?"));
	}
	
	//Test Case 5
	@Test
	public void testAdd()
	{
		Assertions.assertTrue(7 == cs.add(3, 4));
		Assertions.assertTrue(0 == cs.add(3, -3));
	}
	

	//Test Case 6
	@Test
	public void testDifference()
	{
		Assertions.assertTrue(6 == cs.difference(3, -3));
		Assertions.assertTrue(0 == cs.difference(3, 3));
	}
	

	//Test Case 7
	@Test
	public void testMultiplication()
	{
		Assertions.assertTrue(12 == cs.multiplication(3, 4));
		Assertions.assertTrue(0 == cs.multiplication(3, 0));
	}
	

	//Test Case 8
	@Test
	public void testDivision()
	{
		Assertions.assertTrue(2 == cs.division(6, 3));
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		      cs.division(10, 0);
		    });	
			
	}	

	//Test Case 9
	@Test
	public void testCube()
	{
		Assertions.assertEquals(27, cs.cube(3));
	}	
	
	//Test Case 10
	@Test
	public void testMaximum() 
	{
		Assertions.assertEquals(17, cs.findMaximum(new int[]{-5, 0, 5, 9, 17, -27}));
	}
	
	
	
	/*
	@Test
	public void testSum()
	{		
		Assertions.assertEquals(30, cs.sum());
	}
	
	@Test
	public void testMultiply()
	{		
		Assertions.assertEquals(200, cs.multiply());
	}	
	*/

}
