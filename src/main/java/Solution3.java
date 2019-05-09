import java.util.Scanner;

/**
 * Objective
 * In this challenge, you'll work with arithmetic operators. Check out the Tutorial tab for learning materials and
 * an instructional video!
 *
 * Task
 * Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and
 * tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
 *
 * Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!
 *
 * Input Format
 *
 * There are 3 lines of numeric input:
 * The first line has a double, (the cost of the meal before tax and tip).
 * The second line has an integer, (the percentage of being added as tip).
 * The third line has an integer, (the percentage of being added as tax).
 *
 * Output Format
 *
 * Print the total meal cost, where is the rounded integer result of the entire bill ( with added tax and tip).
 */

public class Solution3 {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = (meal_cost * tip_percent) / 100;
        double tax = (meal_cost * tax_percent) / 100;

        int totalCost = (int) Math.round(meal_cost + tip + tax);
        System.out.println(totalCost);

        // OR:
        // System.out.printf("%.0f", meal_cost + tip + tax);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double mealCost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tipPercent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int taxPercent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(mealCost, tipPercent, taxPercent);
        scanner.close();
    }
}
