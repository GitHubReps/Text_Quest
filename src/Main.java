import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        short hole = 10;
        short health = 100;
        short respect = 20;
        short weight = 30;

        Scanner in = new Scanner(System.in);
        System.out.println("To start game press 1, to exit press 0: ");
        short num = in.nextShort();
        if (num == 1) {
            System.out.println("Game started!");
            for (num = 1; ;) {
                System.out.println("Your current stats are: ");
                System.out.printf("Hole length: %d\n", hole);
                System.out.printf("Health points: %d\n", health);
                System.out.printf("Respect: %d\n", respect);
                System.out.printf("Weight: %d\n", weight);

            }
        }

        else if (num == 0) {
            System.out.println("Exiting..");
        }
    }
}
