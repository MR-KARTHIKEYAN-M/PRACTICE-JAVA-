import java.util.Scanner;  

public class AddThreeNumbers {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        
        System.out.println("The numbers are " + num1 + " , " + num2 + " and " + num3 +".");
        System.out.println("Their sum is " + sum + ".");

    }
}
