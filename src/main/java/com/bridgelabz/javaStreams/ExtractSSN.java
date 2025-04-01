// Creating the ExtractSSN to find the SSN number
package com.bridgelabz.javaStreams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractSSN {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Required regex
        String regex = "[0-9]{3}-[0-9]{2}-[0-9]{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println("Found: " + matcher.group());
        }

    }
}

//My SSN in 123-45-6789
//Found: 123-45-6789