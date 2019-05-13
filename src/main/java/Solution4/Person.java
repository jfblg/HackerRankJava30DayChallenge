package Solution4;

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