import java.util.Scanner;

/**
 * If is odd, print Weird
 * If is even and in the inclusive range 2 to 5 of to print Not Weird
 * If is even and in the inclusive range 6 to 20 of to print Weird
 * If is even and greater than 20, print Not Weird
 */

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        scanner.close();

        if ((N >= 2 && N <= 5) && (N % 2 == 0)){
            System.out.println("Not Weird");
        } else if ((N >=6 && N <= 20)  && (N % 2 == 0)) {
            System.out.println("Weird");
        } else if ((N >= 20) && (N % 2 == 0)) {
            System.out.println("Not Weird");
        } else if (N % 2 == 1) {
            System.out.println("Weird");
        }
    }
}
