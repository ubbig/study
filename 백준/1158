import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Integer> josephusPermutation(int n, int k) {
        List<Integer> result = new LinkedList<>();
        List<Integer> people = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        while (!people.isEmpty()) {
            index = (index + k - 1) % people.size();
            result.add(people.remove(index));
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        List<Integer> permutation = josephusPermutation(n, k);
        for (int i = 0; i < permutation.size(); i++) {
            sb.append(permutation.get(i));
            if (i < permutation.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");

        System.out.println(sb.toString());
    }
}
