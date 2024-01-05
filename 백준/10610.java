import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] numbers = sc.next().toCharArray();
        sc.close();

        Arrays.sort(numbers);

        if (numbers[0] == '0' && isMultipleOfThree(numbers)) {
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i]);
            }
        } else {
            System.out.println("-1");
        }
    }

    private static boolean isMultipleOfThree(char[] numbers) {
        int sum = 0;
        for (char number : numbers) {
            sum += number - '0';
        }
        return sum % 3 == 0;
    }
}
