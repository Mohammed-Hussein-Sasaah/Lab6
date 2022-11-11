/*1. Write a program that reads an initial investment balance and an interest rate,
 then prints the number of years it takes for the investment to reach one million dollars.*/

import java.util.Scanner;
public class onemillion {
    public static void main(String[] args) {
        int year = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Initial Investment Balance: ");
        int investment =in.nextInt();
        System.out.println("Enter The initial Interest Rate: ");
        int rate =in.nextInt();

        while (investment<=1000000) {
            investment+=((investment*rate) /100);
            year++;
        }

        System.out.println("It will take " + year + " years to reach a million dollars");
    }

}