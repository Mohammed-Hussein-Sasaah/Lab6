/*Write a program that reads a word and prints the word in reverse. For
example, if the user provides the input "Harry", the program prints yrraH*/


import java.util.Scanner;
public class reversestring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        String reversestring = " ";
        char ch;


        System.out.print("Please Enter string to reverse =  ");
        str = in.nextLine();

        for (int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            reversestring= ch+reversestring;
        }
        System.out.println("Reversed word: "+ reversestring);
    }
}

