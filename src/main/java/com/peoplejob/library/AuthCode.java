package com.peoplejob.library;

import java.util.Random;

public class AuthCode {

	private static AuthCode authCode = new AuthCode();
	public static AuthCode getAuthCode(){
		return authCode;
	}
	
	public int RandomCode(){
		Random random = new Random();
        
		int result = random.nextInt(10000)+1000;
		 
		if(result>10000){
		    result = result - 1000;
		}
			return result;	
	}
}
