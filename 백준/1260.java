import java.util.*;

public class Main{
    private static ArrayList<ArrayList<Integer>> graph;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        int M = scanner.nextInt(); 
        int V = scanner.nextInt(); 

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        visited = new boolean[N + 1];
        dfs(V);

        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
    }

    private static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i : graph.get(v)) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            for (int i : graph.get(v)) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
