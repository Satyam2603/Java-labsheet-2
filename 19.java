public class {
    public static void main(String[] args) {

        System.out.println("Armstrong Numbers:");

        for (int n = 1; n <= 1000; n++) {
            int temp = n;
            int digits = 0;
            int sum = 0;

            int t = n;

            while (t > 0) {
                digits++;
                t /= 10;
            }

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int)Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == n)
                System.out.print(n + " ");
        }
    }
}
