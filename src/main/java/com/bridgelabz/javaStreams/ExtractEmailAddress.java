// Creating extractEmailAddress to extract all valid email from string
package com.bridgelabz.javaStreams;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractEmailAddress {
     public static void main(String[] args){
         // scanner class to get user's input
         Scanner scanner = new Scanner(System.in);

         // Regex
         String regex = "[A-Za-z0-9%$&-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}";
         String input = scanner.nextLine();

         Pattern pattern = Pattern.compile(regex);

         Matcher matcher = pattern.matcher(input);

         // Finding all valid emails
         while (matcher.find()){
             System.out.println("Matched: " + matcher.group());
         }
     }
}

//Matched: support@example.com
//Matched: info@company.org
