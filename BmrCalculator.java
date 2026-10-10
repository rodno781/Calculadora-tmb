
import java.util.Scanner;

public class BmrCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- 1. DATA INPUT AND VALIDATION ---
        // Ensures valid gender reading by accepting text variations
        String gender = "";
        while (!gender.toLowerCase().contains("male") && !gender.toLowerCase().contains("man")
                && !gender.toLowerCase().contains("female") && !gender.toLowerCase().contains("woman")) {
            System.out.println("Enter your gender: ");
            gender = scanner.nextLine();
        }

        // Age validation (prevents zero or negative values)
        int age = 0;
        while (age <= 0) {
            System.out.println("Enter your age:");
            age = scanner.nextInt();
        }

        double weight = 0.0;
        while (weight <= 0) {
            System.out.println("Enter your weight:");
            String userInput = scanner.next();

            userInput = userInput.replace(',', '.');
            weight = Double.parseDouble(userInput);
        }

        double height = 0.0;
        while (height <= 0) {
            System.out.println("Enter your height:");
            String userInput = scanner.next();

            userInput = userInput.replace(',', '.');
            height = Double.parseDouble(userInput);
        }

        // --- 2. BASAL METABOLIC RATE CALCULATION ---
        double totalbmr = 0;
        if (gender.toLowerCase().contains("male") || gender.toLowerCase().contains("man")) {
            totalbmr = (10 * weight) + (6.25 * height) - (5 * age) + 5;
        } else if (gender.toLowerCase().contains("female") || gender.toLowerCase().contains("woman")) {
            totalbmr = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        }

        // --- 3. PHYSICAL ACTIVITY FACTOR AND TOTAL DAILY EXPENDITURE ---
        double low = 1.2;
        double medium = 1.375;
        double high = 1.725;
        double totalCalories = 0.0;

        System.out.println("\nWhich of these options is your daily physical activity level ?");
        System.out.println("1 - Low | 2 - Medium | 3 - High");
        int option = scanner.nextInt();

        if (option == 1) {
            totalCalories = totalbmr * low;
        } else if (option == 2) {
            totalCalories = totalbmr * medium;
        } else if (option == 3) {
            totalCalories = totalbmr * high;
        } else {
            System.out.println("Invalid option!");
        }

        // --- 4. RESULTS DISPLAY ---
        System.out.println("Basal Metabolic Rate (BMR): " + totalbmr + " kcal");
        System.out.println("Total Daily Energy Expenditure (TDEE): " + totalCalories + " kcal");

        scanner.close();
    }
}
