import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range of fibonacci:");
        int N = input.nextInt();
        
        int n1 = 0, n2 = 1;
        int n3;
        
        System.out.print(n1 + "," + n2); 
        
        for (int i = 2; i < N; i++) {
            n3 = n1 + n2;
            System.out.print("," + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
    

