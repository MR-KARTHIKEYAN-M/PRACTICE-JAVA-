import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the number: ");
        int b = scanner.nextInt();

        System.out.print("The numbers before swapping is : " + a + " and " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.print("The numbers after swapping is : " + a + " and " + b);
       
    }
}