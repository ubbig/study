import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt(); 
        int K = sc.nextInt(); 

        System.out.println(maxTeams(N, M, K));
    }

    private static int maxTeams(int N, int M, int K) {
        while (K > 0) {
            if (N >= 2 * M) {
                N--;
            } else {
                M--;
            }
            K--;
        }
        return Math.min(N / 2, M);
    }
}
