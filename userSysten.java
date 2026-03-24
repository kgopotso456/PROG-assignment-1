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
		System.out.println("Your username must contain an underscore (_) and is no more than five characters long");
		System.out.println("Create a username: ");
		userName = sc.nextLine();
		
		String password;
		System.out.println("Your password must be at least eight charaters long, contain a capital letter(s),a number(s), and a speacial character(s).");
		System.out.println("Create a password: ");
		password = sc.nextLine();
		
		boolean hasCap = false;
		boolean hasNum = false;
		boolean hasSpec = false;
		
		for(int i = 0; i < password.length(); i++){
		    char ch = password.charAt(i);
		    
		    if(Character.isUpperCase(ch)){
		        hasCap = true;
		    }
		    if(Character.isDigit(ch)){
		        hasNum = true;    
		    }
		    if(!Character.isLetterOrDigit(ch)){
		        hasSpec = true;
		    }
		}
		
		String cellPhoneNumber;
		System.out.println("Enter your cell phone number: ");
		cellPhoneNumber = sc.nextLine();
		
		//if statements 
		if(userName.contains("_") && userName.length() <= 5){
		System.out.println("Username successfully captured ");
		}
	else{
	    System.out.println("Username is not correctly formatte;please ensure that your username contains an underscore and it is not more than 5 characters in length.");
	}
	  if(hasCap && hasNum && hasSpec && password.length() >= 8){
	    System.out.println("Password successfully captured ");  
	  }
	  else{
	      System.out.println("password is not correctly formatte; please ensure that your password conntains at least eight charaters, a number, and a special charater.");
	  }
	}
}
