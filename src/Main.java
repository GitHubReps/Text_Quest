import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        short hole = 10;
        short health = 100;
        short respect = 20;
        short weight = 30;
        String userAction = "";

        while ((!userAction.equals("exit")) && (health > 0) && (hole > 0) && (weight > 0)
                && (respect > 0)) {
            // clear term
            for (int i = 0; i < 20; i++) {
                System.out.println("");
            }
            // sout rules
            System.out.printf("Hole: %d", hole);
            System.out.printf("Health: %d", health);
            System.out.printf("Weight: %d", weight);
            System.out.printf("Respect: %d\n", respect);
            System.out.println("Choose an option: 1");
            // read action
            Scanner in = new Scanner(System.in);
            userAction = in.nextLine();
            switch (userAction) {
                case "1":
                    // Dig a hole
                    System.out.println("Dig a hole. 1 Intense, 2 Lazy");
                    switch (userAction) {
                        case "1":
                            // Dig hole: intense
                            hole += 5;
                            health -= 30;
                            break;
                        case "2":
                            // Dig hole: lazy
                            hole += 2;
                            health -= 10;
                            break;
                    }
                    break;
                case "2":
                    break;
                case "3" :
                    break;
            }
        }
    }
}