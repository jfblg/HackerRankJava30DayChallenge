import java.util.Scanner;

public class Solution7a {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i=0; i < count; i++) {
            char[] word = scanner.next().toCharArray();

            for(int j=0; j < word.length; j += 2) {
                System.out.print(word[j]);
            }
            System.out.print(" ");
            for(int j=1; j < word.length; j += 2) {
                System.out.print(word[j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
