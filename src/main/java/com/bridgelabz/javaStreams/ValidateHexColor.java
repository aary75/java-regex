// Creating the ValidateHexColor to check that given hex color is valid or not
package com.bridgelabz.javaStreams;

import java.util.regex.*;
import java.util.Scanner;

public class ValidateHexColor {
     public static void main(String[] args){
         // scanner class to get user's input
         Scanner scanner = new Scanner(System.in);

         // our regex
         String regex = "^#[0-9 A-F a-f]{6}$";
         Pattern pattern = Pattern.compile(regex);

         System.out.print("Given hashcode: ");
         String input = scanner.nextLine();
         Matcher matcher = pattern.matcher(input);

         int count = 1;
         // finding the valid string
         while (matcher.find()){
             System.out.println(matcher.group() + " is valid.");
             count = 0;
         }

         if(count == 1){
             System.out.println(input + " is invalid.");
         }
     }
}

//Given hashcode: #ff4500
//#ff4500 is valid.

//Given hashcode: #123
//#123 is invalid.