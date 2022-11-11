/*6. Write a program that prints all powers of 2 from 2
0 up to 2
20*/


public class Power {
    public static void main(String[] args) {
        int n = 20;
        int i = 0;
        int power = 1;
        while (i <= n) {
            System.out.println("2^" + i + " = " + power);
            power = power * 2;
            i++;
        }
    }
}
