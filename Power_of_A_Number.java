import java.util.Scanner;
public class Power_of_A_Number {
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a number:");
            int n=input.nextInt();
            System.out.println("Enter the power of the number:");
            int p=input.nextInt();
            if(n==0){
                System.out.println("Power of 0 is always 0.");
            }
            int ans=1;
            for(int i=1;i<=p;i++){
                ans *=n;
            }
            System.out.println("Answer: "+ans);
        }
}
