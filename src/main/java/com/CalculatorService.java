package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	/*
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	*/
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int difference(int a, int b) {
		return a - b;
	}
	
	public int multiplication(int a, int b) {
		return a * b;
	}
	
	public double division(double a, double b) {
		if (b == 0) 
		{
			throw new IllegalArgumentException("We cannot divide by 0");
		}
		return a/b;
	}
	
	public int cube(int a)
	{
		return a * a* a;
	}
	
	public int findMaximum(int values[]) {
		
		int maximum = values[0];
		
		for(int i=1; i<values.length;i++)
		{
			if (values[i] > maximum) {
				maximum = values[i];
			}
		}
		
		return maximum;			
	}
	
	@GetMapping("/sum")
	public int sum() {
		return 10+20;
	}
	
	@GetMapping("/multiply")
	public int multiply() {
		return 10*20;
	}
	

}
