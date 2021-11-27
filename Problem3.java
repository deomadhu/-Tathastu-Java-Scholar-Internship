import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of Number: ");
        int n = input.nextInt();
        long factorial = 1;
        for(int i = 1; i <= n; ++i)
        {
            
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", n, factorial);
        input.close();
    }
}