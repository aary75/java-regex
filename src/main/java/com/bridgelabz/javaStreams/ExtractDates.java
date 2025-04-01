// Creating ExtractDates class to find all dates from  string
package com.bridgelabz.javaStreams;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractDates {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        String regex = "(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/(000[1-9]|[0-9][0-9][0-9][1-9]|[0-9][0-9][0-9]0)";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        // finding all dates
        while (matcher.find()){
            System.out.print(matcher.group() + ", ");
        }

    }
}

//The events are scheduled for 12/05/2023, 15/08/2024 and 29/02/2020
//        12/05/2023, 15/08/2024, 29/02/2020,
