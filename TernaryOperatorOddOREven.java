import java.util.Scanner;

public class TernaryOperatorOddOREven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        String ternary = (num % 2 == 0) ? "Even" : "Odd";  //(Operand) ? True : False ;
        System.out.print(num + " is " + ternary);

    }
}