import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class WelcomeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();

        System.out.println("Welcome, " + name + "!");

        // Option a) - Create current date and time
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Current date and time: " + formattedDate);

        // Option b) - Display the date and time along with the welcome message
        System.out.println("Welcome, " + name + "! Current date and time: " + formattedDate);
    }
}
