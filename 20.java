import java.util.Scanner;

public class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;
        String correctPassword = "java123";

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (!password.equals(correctPassword))
                System.out.println("Wrong Password");

        } while (!password.equals(correctPassword));

        System.out.println("Correct Password");
        System.out.println("Access Granted");
    }
}
