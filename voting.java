import java.util.Scanner;

public class voting {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age >= 18)
            System.out.println(age+" years can Vote");
        else
            System.out.println(age+" years Can not Vote");
        sc.close();
    }
}