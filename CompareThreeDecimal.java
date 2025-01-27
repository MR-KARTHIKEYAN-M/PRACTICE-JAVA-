import java.util.Scanner;  

public class CompareThreeDecimal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1 :");
        float num1 = scanner.nextFloat();
        System.out.println("Enter num2 :");
        float num2 = scanner.nextFloat();

        num1 = Math.round(num1 * 1000.0f) / 1000.0f;
        num2 = Math.round(num2 * 1000.0f) / 1000.0f;
        System.out.println("The numbers are " + num1 + " and " + num2 +".");

        if (num1 == num2) {
            System.out.println("The numbers are equal up to 3 decimal places.");
        } else {
            System.out.println("The numbers are not equal up to 3 decimal places.");
        }

    }
}
