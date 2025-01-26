import java.util.Random;  

public class SumOfRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        
        int num1 = random.nextInt(1000);  
        int num2 = random.nextInt(1000);  
        
        int sum = num1 + num2;
        
        System.out.println("The numbers are " + num1 + " and " + num2 +".");
        System.out.println("Their sum is " + sum + ".");

    }
}
