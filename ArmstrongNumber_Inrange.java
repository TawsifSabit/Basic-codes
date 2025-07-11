import java.util.Scanner;
public class ArmstrongNumber_Inrange {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the lower range:");
        int lower=input.nextInt();
        System.out.println("Enter the upper range:");
        int upper=input.nextInt();
         for(int i=lower;i<=upper;i++){
            int sum=0;
            int Originalnum=i;
            int digits=String.valueOf(i).length();
            int temp=i;
            
            while(temp>0){
            int digit= temp%10;
            sum +=Math.pow(digit, digits);
            temp /=10;
    }
    if(sum==Originalnum){
            System.out.println(Originalnum+" is Amstrong.");
        }
}

    }
    
}
