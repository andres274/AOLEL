import java.util.Scanner;



public class Authentication {
	
	public static void main(String [] args) {
	
	Scanner keyboard = new Scanner (System.in);
	
	String correctUsername = "Andres";
	
	String correctPassword = "csc201";
	
	System.out.println("Enter your username");
	
	String inputUsername = keyboard.nextLine();
	
	System.out.println("Enter your password");
	
	String inputPassword = keyboard.nextLine();
		
		if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
		
		System.out.println("Welcome Andres");
	
		}
		
		else {
		
		System.out.println("Invlaid Username or Password");

}

}

}
