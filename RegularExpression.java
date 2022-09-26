package Regex;
import java.util.Scanner;
import java.util.regex.*;

public class RegularExpression {
	//Checking for first name start with capital and has minimum 3 chararcters 
	public static boolean isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}");
		Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();

	}
	public static void main(String[] args) {
		//user input
		Scanner name = new Scanner(System.in);
		System.out.println("Enter your first Name starting with capital case :");
		String firstName=name.next();
		System.out.println(isValidFirstName(firstName));
}
}