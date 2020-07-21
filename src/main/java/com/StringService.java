package com;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringService {
	
	// Display message
	public String displayMessage(String message) {
		if (message.length() == 0)
		{
			return "Message is blank";
		}
		else
		{
			return message;
		}
	}
	
	// Return length of message
	public int lengthMessage(String message) {
		return message.length();
	}
	
	//Convert message into lowercase
	public String messageToLower(String message) {
		return message.toLowerCase();
	}
	
	
	//Concatenate message with Hello
	public String messageToConcat(String message) {
		return "Hello, ".concat(message);
	}
	
		
	

}
