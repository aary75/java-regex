// Creating the ValidLicenseNumber to check given number plate is valid or not
package com.bridgelabz.javaStreams;

import java.util.regex.*;
import java.util.Scanner;

public class ValidLicenseNumber {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        String regex = "^[A-Z]{2}[0-9]{4}$"; // regex for license plate number

        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        Matcher matcher = pattern.matcher(input);

        // finding the valid username
        while (matcher.find()){
            System.out.println(matcher.group() + " is valid.");
        }
    }
}

//AB1234
//AB1234 is valid.