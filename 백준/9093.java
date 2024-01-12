import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < T; i++) {
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");

            for (String word : words) {
                System.out.print(new StringBuilder(word).reverse().toString() + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
