package Regex;
import java.util.Scanner;
import java.util.regex.*;

public class RegularExpression {
	//Checking for first name start with capital and has minimum 3 characters 
	public static boolean isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}");
		Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
	}
	//Checking for last name start with capital and has minimum 3 characters 
	public static boolean isValidLastName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}");
		Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
	}
	//method to check for a valid Email
	public static boolean isValidEmail() {
	Pattern pattern = Pattern.compile("^[a][b][c].[x][y][z]+@[b][l].[c][o].[i][n]");
	Matcher matcher = pattern.matcher("abc.xyz@bl.co.in");
    return matcher.matches();
    
	}	public static void main(String[] args) {
		//user input
		Scanner name = new Scanner(System.in);
		System.out.println("Enter your first name starts with capital and has minimum 3 characters :");
		String firstName=name.next();
		System.out.println("Enter your last name starts with capital and has minimum 3 characters :");
		String lastName=name.next();
		System.out.println(isValidFirstName(firstName));
		System.out.println(isValidFirstName(lastName));
		System.out.println(isValidEmail());
}
}