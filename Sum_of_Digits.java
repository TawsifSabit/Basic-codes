import java.util.Scanner;
public class Sum_of_Digits{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        int sum=0;
        if(num==0){
            System.out.println("The input number is 0 so, the summation is also 0.");
        }
        while(num!=0){
         sum += num % 10;
         num = num / 10;
     }
        
        System.out.println("Summation of the digits:"+" "+sum);
    }
}
