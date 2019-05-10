import java.util.Scanner;

public class Solution7b {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        for(int i=0; i<n; i++) {
            char[] inputWord = scanner.next().toCharArray();
            StringBuilder oddString = new StringBuilder();
            StringBuilder evenString = new StringBuilder();

            for(int j=0; j < inputWord.length; j++) {
                if ((j & 1) == 0) {
                    oddString.append(inputWord[j]);
                } else {
                    evenString.append(inputWord[j]);
                }
            }
            System.out.println(oddString + " " + evenString);
        }
        scanner.close();
    }
}

