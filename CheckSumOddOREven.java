import java.util.Scanner;

public class CheckSumOddOREven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        if(sum % 2 == 0){
            System.out.print(sum +" is a Even Number.");
        }else{
            System.out.print(sum +" is a Odd Number.");
        }
    }
}