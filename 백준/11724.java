import java.util.*;

public class Main {
    private static ArrayList<Integer>[] graph;
    private static boolean[] visited;
    private static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int M = scanner.nextInt();
        
        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            graph[u].add(v);
            graph[v].add(u);
        }

        int componentCount = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                componentCount++;
            }
        }

        System.out.println(componentCount);
    }

    private static void dfs(int node) {
        visited[node] = true;
        for (int adj : graph[node]) {
            if (!visited[adj]) {
                dfs(adj);
            }
        }
    }
}
