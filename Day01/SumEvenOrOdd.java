//WAP TO CHECK WHETHER SUM OF NUMBER BETWEEN IN RANGE IS EVEN OR ODD

import java.util.Scanner;

public class SumEvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to be calculated as a Sum...");
        int total = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= total; i++) {
            System.out.println("Enter a " + i + "th Value");
            int num = scanner.nextInt();

            sum = sum + num;

        }
        if (sum % 2 == 0) {
            System.out.println(sum + " The Sum of Number is Even...");
        }
        else {
        System.out.println(sum + " The Sum of Number is Odd...");
       }
    }
}