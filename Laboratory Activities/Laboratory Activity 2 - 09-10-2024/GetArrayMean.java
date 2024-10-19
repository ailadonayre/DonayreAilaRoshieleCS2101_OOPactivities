import java.util.Scanner;

public class GetArrayMean {

    public static double getArrayMean(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter number of elements: ");
        int n = scanner.nextInt();
        int[] array_num = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            array_num[i] = scanner.nextInt();
        }

        double mean = getArrayMean(array_num);
        System.out.printf("Mean of array is: %.2f%n", mean);

        scanner.close();
    }
}