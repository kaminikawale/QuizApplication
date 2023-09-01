package com.quizapplication;

import java.util.Scanner;

public class Login implements UserOperation{
	String stdusername="kk";
	String stdpassword="123";

	@Override
	public void userLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username");
		String username = sc.next();
		System.out.println("enter password");
		String password= sc.next();
		//check for username in database
		if(stdusername.equals(username)) {
			//check for password in database
			if(stdpassword.equals(password)) {
			System.out.println("login Sucessfull");
			}
			else {
			System.out.println("please check your password");
			}
		  }
		else {
				System.out.println("please check your username");
			//call registration method
		}
		
	}

}
