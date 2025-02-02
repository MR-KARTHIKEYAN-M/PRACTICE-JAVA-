import java.util.Scanner;

public class OddOREven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.print(num +"is a Even Number.");
        }else{
             System.out.print(num +"is a Odd Number.");
        }
    }
}