import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // K와 N을 입력 받음
        int K = sc.nextInt();
        int N = sc.nextInt();

        // K개의 랜선 길이를 저장할 배열
        int[] lanCables = new int[K];

        // 최대 랜선 길이를 찾기 위한 변수들
        long max = 0;

        // 랜선 길이 입력
        for (int i = 0; i < K; i++) {
            lanCables[i] = sc.nextInt();
            if (max < lanCables[i]) {
                max = lanCables[i];
            }
        }

        // 이진 탐색을 위한 변수 설정
        long min = 1;
        long mid = 0;
        long result = 0;

        // 이진 탐색 시작
        while (min <= max) {
            mid = (min + max) / 2;

            long count = 0;
            // 현재 mid 길이로 랜선을 몇 개 만들 수 있는지 계산
            for (int i = 0; i < K; i++) {
                count += (lanCables[i] / mid);
            }

            // 만들 수 있는 랜선의 개수에 따라 범위 조정
            if (count < N) {
                max = mid - 1;
            } else {
                min = mid + 1;
                result = mid; // 가능한 최대 길이 갱신
            }
        }

        // 결과 출력
        System.out.println(result);
        sc.close();
    }
}
