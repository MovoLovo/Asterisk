import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize scanner to read input data
        Scanner sc = new Scanner(System.in);

        // Initialize queue
        ArrayQueue<Character> chars = new ArrayQueue<>();

        // Get the input line
        String input = sc.nextLine();

        // Loop over every character in the input
        for(int i = 0; i < input.length(); i++){

            // If the character is an asterisk
            if(input.charAt(i) == '*'){

                // Get the character at the front of the queue
                Character temp = chars.poll();

                // If the queue is empty
                if(temp == null){
                    // Tell the user that they have an invalid input
                    System.out.println("\nError: Array is empty when asterisk is received");
                    break;
                }

                // Print the character that was at the front of the queue
                System.out.print((char)temp);
                continue;
            }

            // Add the character to the queue
            chars.add(input.charAt(i));
        }
    }
}
