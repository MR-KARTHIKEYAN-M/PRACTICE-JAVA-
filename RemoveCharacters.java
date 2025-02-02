import java.util.Scanner;

public class RemoveCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String string = scanner.nextLine();

        System.out.println(string.replaceAll("^[a-z,A-Z]"," "));
   
    }
}