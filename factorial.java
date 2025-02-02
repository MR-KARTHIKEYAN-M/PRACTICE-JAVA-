import java.util.Scanner;

class factorial{
    static int factorial(int n)
    {
        if(n == 0){
            return 1;
        }else
        return (n * factorial(n-1));
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int fact = factorial(number);

        System.out.println("Factorial of the number is : " + fact);    
    }
}