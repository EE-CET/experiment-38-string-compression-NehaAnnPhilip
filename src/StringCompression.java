import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if there is any input at all
        if (!sc.hasNextLine()) {
            return;
        }

        String S = sc.nextLine();

        // Edge case: empty string
        if (S.isEmpty()) {
            return;
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        // Iterate through the string
        for (int i = 0; i < S.length(); i++) {
            // Check if next character is the same
            if (i + 1 < S.length() && S.charAt(i) == S.charAt(i + 1)) {
                count++;
            } else {
                // Character changed or end of string reached
                result.append(S.charAt(i)).append(count);
                count = 1; // Reset count
            }
        }

        String compressed = result.toString();

        // Compare lengths: ONLY print compressed if it is strictly shorter
        if (compressed.length() < S.length()) {
            System.out.println(compressed);
        } else {
            System.out.println(S);
        }

        sc.close();
    }
}
