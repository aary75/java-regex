// Creating extractLinks class to find all web links
package com.bridgelabz.javaStreams;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractLinks {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        String regex = "[a-zA-Z]+://[a-zA-Z0-9.]+\\.[a-zA-Z]{3}";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        // finding all links
        while (matcher.find()){
            System.out.print(matcher.group() + ", ");
        }

    }
}

//"Visit https://www.google.com and http://example.org for more info."
//https://www.google.com, http://example.org,

