import java.util.Scanner;

public class Solution7a {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder outputString = new StringBuilder();
        int arraySize = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //initialize an array of int
        int[] inArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            inArray[i] = scanner.nextInt();

        }

        for (int i = inArray.length - 1; i >= 0; i--) {
            outputString.append(inArray[i]);
            if(i > 0) {
                outputString.append(" ");
            }
        }
        System.out.println(outputString);

        scanner.close();
    }
}
