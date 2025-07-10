import java.util.Scanner;
public class positive_or_negative {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=input.nextInt();
        if(n==0){
            System.out.println("The number is zero.");
        }
        else if(n>0){
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is negative.");
        }
    }
    
}
