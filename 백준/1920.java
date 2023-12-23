import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        Arrays.sort(A);

        int M = scanner.nextInt();
        for (int i = 0; i < M; i++) {
            int key = scanner.nextInt();
            if (binarySearch(A, key)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        scanner.close();
    }

    public static boolean binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == key) {
                return true;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
