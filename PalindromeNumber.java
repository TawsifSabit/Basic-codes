import java.util.Scanner;

public class PalindromeNumber {
    
    public static void checkPalindrome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        input.close();
        
        int reversed = 0;
        int original = number;
        
        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        if(original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        checkPalindrome();
    }
}