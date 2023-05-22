package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class UserRegistrationMain {

    public static void userDataValidation(){
        Scanner sc = new Scanner(System.in);
        String fName=null;

        int temp = -1;
        while(temp != 0) {
            System.out.println("1.FirstName 7.Exit");
            System.out.print("Enter the option:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    boolean flagFname = false;
                    while (flagFname != true) {
                        System.out.print("Enter first name:");
                        fName = sc.next();
                        if (firstNameValidation(fName)) {
                            flagFname = true;
                            System.out.println("first name valid");
                        } else {
                            System.out.println("!first name not valid!");
                        }
                    }
                    break;
                case 7:
                    temp = 0;
                    break;
                default:
                    System.out.println("!!! Enter valid option !!!");
                    break;
            }
        }
    }

    public static boolean firstNameValidation(String value){
        Pattern pattern = Pattern.compile("^[A-Z]{1,1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(value);
        return (matcher.matches());
    }

    public static void main(String[] args) {
        System.out.println("USER REGISTRATION WITH REGEX");
        userDataValidation();
    }
}
