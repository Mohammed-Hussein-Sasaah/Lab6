/*8. Prime numbers. Write a program that prompts the user for an integer and then 
prints out all prime numbers up to that integer. For example, when the user 
enters 20, the program should print
2 
3
5
7 
11
13
17
19 */


import java.util.Scanner;
class PrimeNumbers {
    public static void main(String[] args) {
        int n;
        int p;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = s.nextInt();
        for (int i = 2; i < n; i++) {
            p = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    p = 1;
            }
            if (p == 0)
                System.out.println(i);
        }
    }
}
