import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 0; i < T; i++) {
            int age = scanner.nextInt();
            Person p = new Solution5.Person(age); // this is wrong. you can not reference the class from a static context
            p.amIOld();
            for(int j=0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        scanner.close();
    }

    public class Person {
        private int age;

        public Person(int initialAge) {

            if(initialAge < 0) {
                System.out.println("Age is not valid, setting age to 0.");
                initialAge = 0;
            }
            this.age = initialAge;
        }

        public void yearPasses() {
            this.age += 1;
        }

        public void amIOld() {
            if(this.age < 13) {
                System.out.println("You are young.");
            } else if(this.age >= 13 && this.age < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
        }
    }

}
