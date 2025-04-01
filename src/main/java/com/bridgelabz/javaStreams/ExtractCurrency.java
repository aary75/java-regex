// Creating the ExtractCurrency class to find out currency values from string
package com.bridgelabz.javaStreams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Required regex
        String regex = "\\$?[0-9]{2,}\\.[0-9]{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println("Found: " + matcher.group());
        }

    }
}

//The price is $45.99 and the discount is 10.50
//Found: $45.99
//Found: 10.50
