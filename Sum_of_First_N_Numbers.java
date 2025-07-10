import java.util.Scanner;
public class Sum_of_First_N_Numbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the range of the numbers:");
        int N=input.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++){
             sum += i;
        }
        System.out.println("The summation of the numbers is:"+ sum);
    }
    
}
