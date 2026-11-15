import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter starting year: ");
        int start = sc.nextInt();

        System.out.print("Enter ending year: ");
        int end = sc.nextInt();

        boolean leap = (year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0));

        if (leap && year >= start && year <= end)
            System.out.println("Leap Year and Within Range");
        else
            System.out.println("Condition Not Satisfied");
    }
}
