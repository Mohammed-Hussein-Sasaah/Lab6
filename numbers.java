/*2. Write programs with loops that compute
a. The sum of all even numbers between 2 and 100 (inclusive).
b. The sum of all odd numbers between a and b (inclusive), where a and b are
inputs.
c. The sum of all odd digits of an input. (For example, if the input is 32677,
the sum would be 3 + 7 + 7 = 17.)*/


// a
import java.util.Scanner;
public class evennumbers {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println(sum);
            }
        }
    }
}


// b
import java.util.Scanner;
public class oddnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter First odd Number :");
        int a = in.nextInt();
        System.out.println("Enter Second odd Number :");
        int b = in.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if(i%2 != 0)
                sum = sum +i;
        }
        System.out.println(sum);

    }

}


// c
import java.util.Scanner;
public class odddigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = in.nextLine();
        int length = input.length();

        int sum = 0;

        for (int i = 0; i < length; i++) {
            int digit = input.charAt(i) - '0';
            if (digit % 2 == 1) {
                System.out.println("Add digit: " + digit);
                sum += digit;
            }
        }
        System.out.println(sum);
    }
}

