import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        // User Input
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.print("Write a word: ");
            String user_input = scnr.nextLine();

            // Reversing String;
            StringBuffer user_input2 = new StringBuffer(user_input);
            user_input2.reverse();
            System.out.println(user_input2);
        }

    }
}
