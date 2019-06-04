import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double height, weight, bmi;

        System.out.println("Enter the height (in meter):");
        height = input.nextDouble();
        System.out.println("Enter the weight (in kilogram):");
        weight = input.nextDouble();

        bmi = weight/Math.pow(height,2);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18) System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25) System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30) System.out.printf("%-20.2f%s", bmi, "Overweight");
        else System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
