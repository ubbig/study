import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]); // 나무의 수
        int M = Integer.parseInt(firstLine[1]); // 필요한 나무의 길이

        int[] trees = new int[N];
        String[] secondLine = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(secondLine[i]);
        }

        // high = 나무높이 최대값
        int low = 0;
        int high = 1000000000;
        int maxH = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            long total = 0; // 잘린 나무의 총 길이

            for (int tree : trees) {
                if (tree > mid) {
                    total += tree - mid;
                }
            }

            if (total >= M) {
                maxH = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(maxH);
    }
}
