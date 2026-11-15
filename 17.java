import java.util.Scanner;

public class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = (n << 2) | (n >>> 30);

        System.out.println("Original Number = " + n);
        System.out.println("After Left Rotation = " + result);
    }
}
