package org.launchcode;

import java.util.Scanner;
public class SearchString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        System.out.println("Enter a term to search for within the string: ");
        String chunk = input.nextLine();

        System.out.println(alice.indexOf(chunk));
    }
}
