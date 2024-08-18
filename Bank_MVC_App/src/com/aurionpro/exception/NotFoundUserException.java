package com.aurionpro.exception;

import com.aurionpro.error.NotFoundUserError;

public class NotFoundUserException extends Throwable {
	
	public void showMessage(NotFoundUserError error) {
		error.setMessage("User Not Found");
		System.out.println(error.getMessage());
		
	}
	
	
}
