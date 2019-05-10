package Solution5;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 0; i < T; i++) {
            int age = scanner.nextInt();
            Person p = new Person(age); // this is wrong. you can not reference the class from a static context
            p.amIOld();
            for(int j=0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        scanner.close();
    }
}
