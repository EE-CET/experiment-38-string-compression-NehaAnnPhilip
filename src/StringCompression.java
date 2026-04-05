
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine().trim();

        if (S.length() == 0) {
            System.out.print(S);
            return;
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                count++;
            } else {
                result.append(S.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        result.append(S.charAt(S.length() - 1)).append(count);

        String compressed = result.toString();

        if (compressed.length() < S.length()) {
            System.out.print(compressed);
        } else {
            System.out.print(S);
        }

        sc.close();
    }
}
