// Creating ReplaceMultipleSpaces to delete more than one spaces
package com.bridgelabz.javaStreams;
import java.util.Scanner;;

public class ReplaceMultipleSpaces {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Required regex
        String regex = "\\s{2,}";

        String result = input.replaceAll(regex, " ");
        System.out.println(result);
    }
}

//Hello  I am     Aaryan
//Hello I am Aaryan