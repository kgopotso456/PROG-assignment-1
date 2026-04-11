Student Name[Kgopotso ngwato]
Student Number[10527357]
PART 1

### Project Declaration
This is a java application for a user Registration and Login system.

import java.util.Scanner;

public class userSystem {

    private static String userName;
    private static String password;
    private static String cellPhoneNumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        logIn loginTool = new logIn();

        //********Registration************
        System.out.println("*****Registration*****");

        System.out.println("Your username must contain an underscore (_) and is no more than five characters long");
        System.out.println("Create a username: ");
        userName = sc.nextLine();
        
        // Check using the tool and print individual success message
        if (loginTool.checkUserName(userName)) {
            System.out.println("Username successfully captured");
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and it is not more than 5 characters in length.");
        }

        System.out.println("Your password must be at least eight characters long, contain a capital letter(s), a number(s), and a special character(s).");
        System.out.println("Create a password: ");
        password = sc.nextLine();
        
        // Check using the tool and print individual success message
        if (loginTool.checkPasswordComplexity(password)) {
            System.out.println("Password successfully captured");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that your password contains at least eight characters, a number, and a special character.");
        }

        System.out.println("Your cell phone number must start with a country code e.g(+72) and the following digits must be less than 10");
        System.out.println("Enter your cell phone number: ");
        cellPhoneNumber = sc.nextLine();

        if (loginTool.checkCellPhoneNumber(cellPhoneNumber)) {
            System.out.println("cell phone number successfully captured");
        } else {
            System.out.println("Cell phone number is not correctly formatted or does not contain international code.");
        }

        System.out.println("\n" + loginTool.registerUser(userName, password));

        //*******LOGIN********
        System.out.println("\n*******LOGIN********");

        System.out.println("Enter your username:");
        String loginUser = sc.nextLine();

        System.out.println("Enter your password:");
        String loginPass = sc.nextLine();

        // Uses the logIn class to verify the login
        boolean isSuccess = loginTool.loginUser(loginUser, loginPass, userName, password);
        
        // This shows the "A successful login" or "A failed login" message
        System.out.println(loginTool.returnLoginStatus(isSuccess));

        if (isSuccess) {
            System.out.println("Welcome back " + userName + " it is great to see you again");
        } else {
            System.out.println("Username or Password incorrect please try again");
        }
    }
}

class logIn {

    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        boolean hasCap = false;
        boolean hasNum = false;
        boolean hasSpec = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                hasCap = true;
            }
            if (Character.isDigit(c)){
                hasNum = true;
            }
            if (!Character.isLetterOrDigit(c)){
                hasSpec = true;
            }
        }
        return hasCap && hasSpec && hasNum && password.length() >= 8;
    }

    public boolean checkCellPhoneNumber(String cellNumber) {
        return cellNumber.matches("^\\+\\d{1,3}\\d{1,9}$");
    }

    public String registerUser(String username, String password) {
        if (!checkUserName(username)) {
            return "The username is incorrectly formatted.";
        } else if (!checkPasswordComplexity(password)) {
            return "The password does not meet the complexity requirements.";
        } else {
            return "The two above conditions have been met and the user has been registered successfully.";
        }
    }

    public boolean loginUser(String username, String password, String storedUser, String storedPass) {
        return username.equals(storedUser) && password.equals(storedPass);
    }

    public String returnLoginStatus(boolean isLoggedIn) {
        if (isLoggedIn) {
            return "A successful login";
        } else {
            return "A failed login";
        }
    }
}
