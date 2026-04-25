import java.util.Scanner;

public class TicTacToeUC3 {

    // Method to read user input
    public static int getUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");

        int slot = scanner.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        // Call method
        int selectedSlot = getUserInput();

        // Display result
        System.out.println("You selected slot: " + selectedSlot);
    }
}