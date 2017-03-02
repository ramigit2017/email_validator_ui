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
		//New rule: checks if email is at least 6 chars
		if (email.length()>=6){
			rule = true;
				}
		//New rule: checks if email is 20 chars long or less
		if (email.length()<=20){
			rule = true;
				}
		return rule;
	}
}