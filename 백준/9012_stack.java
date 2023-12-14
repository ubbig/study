import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < T; i++) {
            System.out.println(isValidPSWithStack(scanner.nextLine()) ? "YES" : "NO");
        }

        scanner.close();
    }

    private static boolean isValidPSWithStack(String ps) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ps.length(); i++) {
            char c = ps.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return false;
            } else {
                stack.pop();
            }
        }

        return stack.empty();
    }
}
