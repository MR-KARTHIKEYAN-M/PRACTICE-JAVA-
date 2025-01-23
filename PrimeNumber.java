import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = false;

        if (num == 1) 
        {
            isPrime = true;
        }

        for (int i = 2; i <= num / 2; ++i) 
        {
            if (num % i == 0) 
            {
                isPrime = true;
                break;
            }
        }

        if (!isPrime)
        System.out.println(num + " is a prime number.");
        else
        System.out.println(num + " is not a prime number.");
    }
}
    

