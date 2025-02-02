import java.util.Scanner;

public class PositiveSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("The two given numbers are : "+ num1 + " and "+ num2);

        int sum = num1 + num2;
        System.out.println("The sum of two given number is: " + sum);

        int sub = num1 - num2;
        System.out.println("The subtraction of two given number is: " + Math.abs(sub));

    }
}