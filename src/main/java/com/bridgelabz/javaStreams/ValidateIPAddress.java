// Creating ValidateIPAddress to check IP address is valid or not
package com.bridgelabz.javaStreams;

import java.util.regex.*;
import java.util.Scanner;

public class ValidateIPAddress {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        // regex for IP address
        String regex = "((25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9]]{1,2})";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Finding the correct IP address
        while(matcher.find()){
            System.out.print("Valid: "+ matcher.group());
        }
    }
}

//255.255.244.255
//Valid: 255.255.244.255