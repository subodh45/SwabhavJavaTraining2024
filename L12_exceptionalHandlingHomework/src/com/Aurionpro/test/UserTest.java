package com.Aurionpro.test;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.Aurionpro.Model.EmailNotValidException;
import com.Aurionpro.Model.PasswordNotValidException;
import com.Aurionpro.Model.User;

public class UserTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
		System.out.println("enter email ");
		String email = scanner.next();
		if(!EmailValidator(email))
		{
			 throw new EmailNotValidException(email);	
		}
		
		System.out.println("Email Validate Successfully.");
		System.out.println("enter password :");
		String password =scanner.next();
		
		
		if(!ValidatePassword(password))
		{
			throw new PasswordNotValidException(password);
		}
		 System.out.println("Password Validate Successfully.");
		
		User user =new User(email,password);
		System.out.println(user);
		}catch(EmailNotValidException exception)
		{
			System.out.println(exception.getMessage());
		}catch(PasswordNotValidException exception)
		{
			System.out.println(exception.getMessage());
		}
	}

	private static boolean EmailValidator(String email) {
		if(!email.contains("@")||!email.contains(".")||email.isEmpty()||email.length()<12||email ==null)
		{ return false;}
		return true;		
	}

	private static boolean ValidatePassword(String password) {
		
		if(password ==null)
		{
			return false;
		}
		String regex ="^(?=.*[0-9])" +"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher =pattern.matcher(password);
		
		return matcher.matches();
		
	}
}
