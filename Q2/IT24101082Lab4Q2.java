import java.util.Scanner;

public class IT24101082Lab4Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
            return;
        }
        System.out.print("Enter the lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
            return;
        }
        System.out.print("Enter the percentage for exam marks: ");
        double examPercentage = scanner.nextDouble();
        if (examPercentage < 0 || examPercentage > 100) {
            System.out.println("Invalid input! Percentage should be between 0 and 100.");
            return;
        }
        System.out.print("Enter the percentage for lab marks: ");
        double labPercentage = scanner.nextDouble();
        if (labPercentage < 0 || labPercentage > 100) {
            System.out.println("Invalid input! Percentage should be between 0 and 100.");
            return;
        }
        if (examPercentage + labPercentage != 100) {
            System.out.println("The total percentage should add up to 100.");
            return;
        }

        // Calculate final exam marks
        double finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        // Display the final marks
        System.out.println("Final exam marks: " + finalMarks);
    }
}
