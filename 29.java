import java.util.Random;

public class {
    public static void main(String[] args) {

        Random random = new Random();

        while (true) {
            int n = random.nextInt(100) + 1;

            System.out.println("Random Number = " + n);

            if (n % 7 == 0 && n % 13 == 0) {
                System.out.println("Number Found = " + n);
                break;
            }
        }
    }
}
