import java.util.Scanner;

public class AgeGroupClassifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        String ageGroup;

        if (age >= 0 && age <= 12) {
            ageGroup = "Child";
        } else if (age >= 13 && age <= 19) {
            ageGroup = "Teenager";
        } else if (age >= 20 && age <= 64) {
            ageGroup = "Adult";
        } else if (age >= 65) {
            ageGroup = "Senior";
        } else {
            ageGroup = "Invalid age"; 
        }

        System.out.println("Age Group: " + ageGroup);
    }
}