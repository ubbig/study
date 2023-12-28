import java.util.Scanner;

public class Main {
    static int[][] field;
    static boolean[][] visited;
    static int M, N, K;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            M = scanner.nextInt();
            N = scanner.nextInt();
            K = scanner.nextInt();

            field = new int[M][N];
            visited = new boolean[M][N];

            for (int i = 0; i < K; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                field[x][y] = 1; 
            }

            int wormCount = 0; 
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (field[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        wormCount++; 
                    }
                }
            }

            System.out.println(wormCount);
        }
        scanner.close();
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if (field[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
