import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check power of 4 using shift operators
        int temp = n;

        while (temp > 1 && (temp & 3) == 0) {
            temp = temp >> 2;
        }

        if (n > 0 && temp == 1)
            System.out.println("Power of 4");
        else
            System.out.println("Not a Power of 4");

        // Toggle 3rd bit
        int result = n ^ (1 << 2);

        System.out.println("After Toggling 3rd Bit = " + result);

        // Multiplication table
        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 20; i++) {
            int product = n * i;

            if (product != 0 && product % 48 == 0)
                break;

            if (product % 6 == 0)
                continue;

            System.out.println(n + " x " + i + " = " + product);
        }
    }
}
