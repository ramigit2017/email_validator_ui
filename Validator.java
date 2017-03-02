package com.emailui.email_validator_ui;

public class Validator{
	public Validator(){}
	
	public boolean validate(String email){
		int rule = false;
		//checks if for '.' char
		if (email.contains(".")){
			rule = true;
		}
		//checks for a single @char
		if (email.matches("^[^@]*@[^@]*$")){
			rule++;
		}
		return rule;
	}
}