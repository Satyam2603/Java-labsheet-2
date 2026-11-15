import java.util.Scanner;

public class{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        int count = 0;

        while (n >= 1) {
            n /= 2;
            count++;
        }

        System.out.println("Final Value = " + n);
        System.out.println("Total Steps = " + count);
    }
}
