// Creating the ExtractDuplicateWords to find all duplicate words from string
package com.bridgelabz.javaStreams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDuplicateWords {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Required regex
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println("Found: " + matcher.group());
        }

    }
}

//This is is repeated repeated word test
//Found: is
//Found: repeated