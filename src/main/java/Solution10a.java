import java.util.Scanner;

public class Solution10a {
    private static final Scanner scanner = new Scanner(System.in);

    public static int mostConsecutive(int n) {
        String binStr = Integer.toBinaryString(n);
        char[] chArr = binStr.toCharArray();

        int consMax = 0;
        int consMaxLocal = 0;

        for(int i = 0; i < chArr.length; i++) {
            if(chArr[i] == '1') {
                consMaxLocal++;
            } else { // chArr[i] == '0'
                if(consMax < consMaxLocal) {
                    consMax = consMaxLocal;

                }
                consMaxLocal = 0;
            }
        }
        return (consMaxLocal > consMax ? consMaxLocal : consMax);
    }


    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(mostConsecutive(n));
        scanner.close();

    }
}
