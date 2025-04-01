// Creating ReplaceBadWords to replace all bad words from string
package com.bridgelabz.javaStreams;
import java.util.Scanner;;

public class ReplaceBadWords {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Required regex
        String regex = "damn|stupid|idiot|duffer";

        String result = input.replaceAll(regex, "****");
        System.out.println(result);
    }
}

//This is a damn bad example with some stupid words.
//This is a **** bad example with some **** words.
