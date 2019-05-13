import java.util.Scanner;

public class Solution7c {

    private final static Scanner scan = new Scanner(System.in);

    public static void print(String[] arr) {
        for(int i=arr.length -1; i >= 0; i--) {
            if(i > 0) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.println(arr[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        String[] arr = scan.nextLine().split(" ");
        scan.close();
        print(arr);
    }
}
