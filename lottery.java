import java.util.Random;
import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("🎲 Welcome to the Lottery Game!");
        System.out.print("Enter a number between 1 to 10: ");

        int user = sc.nextInt();
        int lucky = rand.nextInt(10) + 1;

        System.out.println("Lucky Number: " + lucky);

        if (user == lucky) {
            System.out.println("🎉 You WIN!");
        } else {
            System.out.println("❌ You lost! Try again.");
        }
    }
}
