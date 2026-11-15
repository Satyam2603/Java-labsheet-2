import java.util.Scanner;

public class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = Character.isDigit(ch)
            ? "Digit"
            : Character.isLetter(ch)
                ? ("aeiouAEIOU".indexOf(ch) >= 0
                    ? "Vowel" : "Consonant")
                : "Special Symbol";

        System.out.println(result);
    }
}
