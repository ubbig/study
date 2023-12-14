import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < T; i++) {
            System.out.println(isValidPS(scanner.nextLine()) ? "YES" : "NO");
        }

        scanner.close();
    }

    private static boolean isValidPS(String ps) {
        int count = 0;

        for (int i = 0; i < ps.length(); i++) {
            if (ps.charAt(i) == '(') {
                count++;
            } else if (ps.charAt(i) == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}
