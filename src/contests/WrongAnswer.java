package contests;

import java.util.Scanner;

public class WrongAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate the sum of a and b
        int sum = a + b;

        // Print any number between 0 and 9 that is not equal to the sum of a and b
        for (int i = 0; i <= 9; i++) {
            if (i != sum) {
                System.out.println(i);
                break;
            }
        }
    }
}
