// Creating the ValidateUserName to check our regex for username is right or not
package com.bridgelabz.javaStreams;

import java.util.regex.*;
import java.util.Scanner;

public class ValidateUserName {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        String regex = "^([a-zA-Z][a-z A-Z 0-9_]?){5,15}$"; // regex for username

        Pattern pattern = Pattern.compile(regex);

        String input = "public static void main";

        Matcher matcher = pattern.matcher(input);

        // finding the valid username
        while (matcher.find()){
            System.out.println("Matched: " + matcher.group());
        }
    }
}

//Matched: public static void main