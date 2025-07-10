import java.util.Scanner;
public class Prime_Number{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();
         if(n<2){
            System.out.println("The number is not prime.");
         }
         for(int i=2;i<n;i++){
            if(n%i==0){
               System.out.println("The number is not prime.");
               break;
            }
            else{
                System.out.println("The number is prime.");
                break;
            }
         }   
}
}
