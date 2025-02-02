import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();
        int reverse = 0;

        while(num != 0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
            System.out.print("Reverse of the number is : " + reverse);
        }

    }
}