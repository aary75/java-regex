// Creating the ValidateCreditCard class to find That credit card number is valid or not
package com.bridgelabz.javaStreams;

import java.util.regex.*;
import java.util.Scanner;

public class ValidateCreditCard {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        String regex = "4[0-9]{15}|5[0-9]{15}";

        System.out.print("Enter credit card number: ");
        String creditCardNumber = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(creditCardNumber);

        // checking the number
        while(matcher.find()){
            if(matcher.group().charAt(0) == '4') System.out.println("This is a VISA credit card.");
            if(matcher.group().charAt(0) == '5') System.out.println("This is a MasterCard credit card.");
        }
    }
}


//Enter credit card number: 45612334561234561
//This is a VISA credit card.