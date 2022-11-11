/*5. Write a program that reads a word and prints the number of vowels in the 
word. For this exercise, assume that a e i o u y are vowels. For example, if the 
user provides the input "Harry", the program prints 2 vowels.*/

import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num=0;
        System.out.println("Enter Name :");
        String Name = in.next();


        for (int i = 0; i <Name.length(); i++)
        {
            if (Name.charAt(i) == 'o'  )
                num++;
            if (Name.charAt(i) == 'e'  )
                num++;
            if (Name.charAt(i) == 'i'  )
                num++;
            if (Name.charAt(i) == 'a'  )
                num++;
            if (Name.charAt(i) == 'y'  )
                num++;
            if (Name.charAt(i) == 'u'  )
                num++;
        }

        System.out.println("the number of vowels :" + num);
    }

}

