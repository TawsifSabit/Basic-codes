import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year:");
        int n=input.nextInt();
        if(n%400==0 || (n%4==0 && n%100 !=0)){
            System.out.println(n+"\tis leap year.");
        }
        else{
            System.out.println(n+"\tis not leap year.");
        }

    }
}
