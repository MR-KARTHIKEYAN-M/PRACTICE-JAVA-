import java.util.Scanner;

public class HighestLowestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        System.out.print("Enter the fourth number: ");
        double num4 = scanner.nextDouble();

        System.out.println("The numbers are " + num1 + " , " + num2 + " , " + num3 + " and " + num4 +".");

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println("The bigger number is: " + num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            System.out.println("The bigger number is: " + num2);
        }  else if (num3 > num1 && num3 > num2 && num3 > num4) {
            System.out.println("The bigger number is: " + num3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3) {
            System.out.println("The bigger number is: " + num4);
        }else {
            System.out.println("Both numbers are equal.");
        }

         if (num1 < num2 && num1 < num3 && num1 < num4) {
            System.out.println("The Smaller number is: " + num1);
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            System.out.println("The Smaller number is: " + num2);
        }  else if (num3 < num1 && num3 < num2 && num3 < num4) {
            System.out.println("The Smaller number is: " + num3);
        } else if (num4 < num1 && num4 < num2 && num4 < num3) {
            System.out.println("The Smaller number is: " + num4);
        }else {
            System.out.println("Both numbers are equal.");
        }

    }
}
