import java.util.Scanner;
public class Factors_of_Number {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.println("Factors of "+n+" are: "+i);
            
        }
    }
    
}
