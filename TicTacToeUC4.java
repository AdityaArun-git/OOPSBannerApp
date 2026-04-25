import java.util.Scanner;

public class TicTacToeUC4 {

    static Scanner scanner = new Scanner(System.in);

    // Method to get slot
    public static int getUserInput() {

        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }

    // Method to convert slot → row
    public static int getRow(int slot) {

        return (slot - 1) / 3;
    }

    // Method to convert slot → column
    public static int getColumn(int slot) {

        return (slot - 1) % 3;
    }

    public static void main(String[] args) {

        int slot = getUserInput();

        int row = getRow(slot);
        int column = getColumn(slot);

        System.out.println("Row index: " + row);
        System.out.println("Column index: " + column);
    }
}