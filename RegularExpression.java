package Regex;
import java.util.Scanner;
import java.util.regex.*;

public class RegularExpression {
	//Checking for first name start with capital and has minimum 3 characters 
	public static boolean isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
		Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
	}
	//Checking for last name start with capital and has minimum 3 characters 
	public static boolean isValidLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
		Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
	}
	//method to check for a valid Email
	public static boolean isValidEmail() {
	Pattern pattern = Pattern.compile("^[a][b][c].[x][y][z][@][b][l].[c][o].[i][n]$");
	Matcher matcher = pattern.matcher("abc.xyz@bl.co.in");
    return matcher.matches();
	}
	//method to check for a valid mobile number
	public static boolean isValidMobileNumber() {
		Pattern pattern = Pattern.compile("^[+][1-9]{1,3} [0-9]{10}$");
		Matcher matcher = pattern.matcher("+91 9876543212");
	    return matcher.matches();    
		}	
	//method to check for a valid password
	//Rule-1: has minimum 8 characters
	//Rule-2: atleast 1 upper case
	//Rule-3:atleast 1 numeric number
	public static boolean isValidPassword(String password) {
		Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[#?!@$%^&*-]).{8,}$");
		Matcher matcher = pattern.matcher(password);
	    return matcher.matches();
	}
	//method to check for a valid for different Emails
	public static boolean isValidUserEmail(String emalId) {
		Pattern pattern = Pattern.compile("^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
		Matcher matcher = pattern.matcher(emalId);
	    return matcher.matches();
		}
	public static void main(String[] args) {
		//user input
		Scanner name = new Scanner(System.in);
		System.out.println("Enter your first name starts with capital and has minimum 3 characters :");
		String firstName=name.next();
		System.out.println(isValidFirstName(firstName));
		System.out.println("Enter your last name starts with capital and has minimum 3 characters :");
		String lastName=name.next();
		System.out.println(isValidLastName(lastName));
		if(isValidEmail()){
			System.out.println("Given Email is Valid");
		}
		else {
			System.out.println("OOPS...Please enter a valid Email");
		}
		if(isValidMobileNumber()){
			System.out.println("Given Number is a Valid Number");
		}
		else {
			System.out.println("OOPS...Please enter a valid Number");
		}
		System.out.println("Enter a password with minimum 8 characters having atleast 1 upper case :");
		String password=name.next();
		System.out.println(isValidPassword(password));
		System.out.println("Enter a valid email Id  :");
		String emailId=name.next();
		System.out.println(isValidUserEmail(emailId));
}
}