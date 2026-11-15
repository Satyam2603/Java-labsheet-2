import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter power: ");
        int p = sc.nextInt();

        int multiply = n << p;
        int divide = n >> p;

        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);
    }
}
