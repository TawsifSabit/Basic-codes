import java.util.Scanner;
public class Greatest_of_Two_NUmbers{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int N1=input.nextInt();
        System.out.println("Enter the second number:");
        int N2=input.nextInt();
        if(N1>N2){
            System.out.println("The greatest number is\t"+N1);
        }
        else{
            System.out.println("The greatest number is\t"+N2);
        }
    }
}
