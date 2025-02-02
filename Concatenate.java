import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First word: ");
        String a = scanner.nextLine();

        System.out.print("Enter the Second word: ");
        String b = scanner.nextLine();

        String c = a + b;
        System.out.println(c);
    }
}