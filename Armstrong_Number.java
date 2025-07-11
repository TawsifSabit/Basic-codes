import java.util.Scanner;
public class Armstrong_Number{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();

        int Originalnum=num;
        int sum=0;
        int digits=String.valueOf(num).length();

        while(num>0){
            int digit= num%10;
            sum +=Math.pow(digit, digits);
            num /=10;
        }

        if(sum==Originalnum){
            System.out.println("The number is Amstrong.");
        }
        else{
            System.out.println("The number is not Amstrong.");
        }
    }
}