import java.util.Scanner;
public class Greatest_of_Three_Numbers{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int N1=input.nextInt();
        System.out.println("Enter the second number:");
        int N2=input.nextInt();
        System.out.println("Enter the three number:");
        int N3=input.nextInt();
        if(N1>N2 && N1>N3){
            System.out.println("The greatest number is\t"+N1);
        }
        else if(N3>N1 && N3>N2){
            System.out.println("The greatest number is\t"+N3);
        }
        else{
            System.out.println("The greatest number is\t"+N2);
        }
    }
}
