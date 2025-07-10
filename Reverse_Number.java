import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();
        int reverse=0;
        if(n==0){
            System.out.println("The number is invalid for reverse.");
        }
        while(n!=0){
            int digit= n%10;
            reverse=reverse*10+digit;
            n /=10;
        }
        System.out.println("Reversed Number: "+reverse);
    }
}
