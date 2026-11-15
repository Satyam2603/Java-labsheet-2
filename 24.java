public class  {
    public static void main(String[] args) {

        int arr[] = {10, 25, 5, 40, 15};

        int max = arr[0];
        int min = arr[0];

        for (int n : arr) {
            if (n > max)
                max = n;

            if (n < min)
                min = n;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
