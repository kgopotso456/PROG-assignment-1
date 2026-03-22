Student Name[Kgopotso ngwato]
Student Number[10527357]
PART 1

### Project Declaration
This is a java application for a user Registration and Login system.

import java.util.Scanner;


public class userSystem
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//********Registration************
		System.out.println("*****Registration*****");
		String userName;
		System.out.println("Create a username: ");
		userName = sc.nextLine();
		
		String password;
		System.out.println("Create a password: ");
		password = sc.nextLine();
		
		String cellPhoneNumber;
		System.out.println("Enter your cell phone number: ");
		cellPhoneNumber = sc.nextLine();
		
		//if statements 
		if(userName.contains("_") && userName.length() <= 5){
		System.out.println("Username successfully captured ");
		}
	else{
	    System.out.println("Username is not correctly formatte;please ensure that your username contains an underscore and it is not more than 5 characters in length");
	}
	}
}
