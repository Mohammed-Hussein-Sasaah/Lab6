/*3. Write a program that reads a word and prints each character of the word on a
separate line. For example, if the user provides the input "Harry", the program
prints
H
A
R
R
Y*/


import java.util.Scanner;
public class readword {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str;
            int i;

            System.out.print("Please Enter any String to Print =  ");
            str = in.nextLine();

            for(i = 0; i < str.length(); i++)
            {
                System.out.println(str.charAt(i));
            }
        }
}

