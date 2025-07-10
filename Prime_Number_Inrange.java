import java.util.Scanner;
public class Prime_Number_Inrange {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the lower range:");
        int lower=input.nextInt();
        System.out.println("Enter the upper range:");
        int upper=input.nextInt();
        if(lower<2 && upper<2 && (lower>upper && upper<lower)){
            System.out.println("Range is invalid.");
        }
        for(int i=lower;i<=upper;i++){
            for(int j=2;j<i;j++){
            if(i%j==0){
               System.out.println(i+"is not prime.");
               break;
            }
            else{
                System.out.println(i+"is prime.");
                break;
            }
         }     
        }
    }
}

