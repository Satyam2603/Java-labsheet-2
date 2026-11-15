public class  {
    public static void main(String[] args) {

        int marks[][] = {
            {70, 80, 90},
            {60, 75, 85},
            {80, 85, 95}
        };

        int total = 0;
        int count = 0;

        for (int row[] : marks) {
            for (int m : row) {
                total += m;
                count++;
            }
        }

        double average = (double) total / count;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
    }
}
