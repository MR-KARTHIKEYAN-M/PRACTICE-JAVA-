import java.util.Scanner;

class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        if (isPalindrome(input)) {
            System.out.println(input + " :palindrome");
        } else {
            System.out.println(input + " :not a palindrome");
        }
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
