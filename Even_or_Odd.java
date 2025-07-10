import java. util.Scanner;
public class Even_or_Odd {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();
        if(n == 0){
            System.out.println("The number is Zero.");
        }
        else if(n % 2 == 0){
            System.out.println("The number is Even.");
        }
        else{
            System.out.println("The number is Odd.");
        }

        }
    }

