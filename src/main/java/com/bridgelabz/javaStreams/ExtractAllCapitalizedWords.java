// Creating the ExtractAllCapitalizedWords to find all capital words
package com.bridgelabz.javaStreams;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractAllCapitalizedWords {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        String regex = "[A-Z][a-z]+";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        // finding all capital words
        while (matcher.find()){
            System.out.print(matcher.group() + ", ");
        }

    }
}

//The Eiffel Tower is in Paris and the Statue of Liberty is in New York
//        The, Eiffel, Tower, Paris, Statue, Liberty, New, York