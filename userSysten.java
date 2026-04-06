Student Name[Kgopotso ngwato]
Student Number[10527357]
PART 1

### Project Declaration
This is a java application for a user Registration and Login system.

import java.util.Scanner;


public class userSystem {
	private String userName;
	private String password;
	private String cellPhoneNumber;

	public static void main(String[] args) {
		String userName;
		String password;
		String cellPhoneNumber;

		Scanner sc = new Scanner(System.in);

		//********Registration************
		System.out.println("*****Registration*****");

		System.out.println("Your username must contain an underscore (_) and is no more than five characters long");
		System.out.println("Create a username: ");
		userName = sc.nextLine();

		System.out.println("Your password must be at least eight charaters long, contain a capital letter(s),a number(s), and a speacial character(s).");
		System.out.println("Create a password: ");
		password = sc.nextLine();

		boolean hasCap = false;
		boolean hasNum = false;
		boolean hasSpec = false;

		for(int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);

			if(Character.isUpperCase(c)) {
				hasCap = true;
			}
			if(Character.isDigit(c)) {
				hasNum = true;
			}
			if(!Character.isLetterOrDigit(c)) {
				hasSpec = true;
			}
		}

		System.out.println("Your cell phone number must start with a country code e.g(+72) and the following  digits must be less than 10");
		System.out.println("Enter your cell phone number: ");
		cellPhoneNumber = sc.nextLine();

		//if statements
		if(userName.contains("_") && userName.length() <= 5) {
			System.out.println("Username successfully captured ");
		}
		else {
			System.out.println("Username is not correctly formatted;please ensure that your username contains an underscore and it is not more than 5 characters in length.");
		}
		if(hasCap && hasNum && hasSpec && password.length() >= 8) {
			System.out.println("Password successfully captured ");
		}
		else {
			System.out.println("password is not correctly formatted; please ensure that your password conntains at least eight charaters, a number, and a special charater.");
		}
		if(cellPhoneNumber.matches("^\\+\\d{1,3}\\d{1,9}$")) {
			System.out.println("cell phone number successfully captured");
		}
		else {
			System.out.println("Cell phone number is not correctly formatted or does not contain international code.");

		}
		//*******LOGIN********
		System.out.println("*******LOGIN********");

		String loginUser;
		System.out.println("Enter your username:");
		loginUser = sc.nextLine();

		String loginPass;
		System.out.println("Enter your password:");
		loginPass = sc.nextLine();

		if(loginUser.equals(userName) && loginPass.equals(password)) {
			System.out.println("Welcome back" + userName + "it ia great to see you again");
		}
		else {
			System.out.println("username or Password incorrect please try again");
		}
	}

}
