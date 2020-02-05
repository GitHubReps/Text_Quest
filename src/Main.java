import java.time.ZoneId;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        short hole = 10;
        short health = 100;
        short respect = 20;
        short weight = 30;
        String userAction = "";
        String subAction = "";
        final short maxRespect = 100;

        while ((!userAction.equals("exit")) && (health > 0) && (hole > 0) && (weight > 0)
                && (respect > 0)) {
            if (respect >= maxRespect) {
                System.out.printf("You won! Your respect is %d! Game is now over.", respect);
                break;
            }
            // clear term
            for (int i = 0; i < 10; i++) {
                System.out.println("");
                if (i >= (10 - 1)) {
                    System.out.println("Starting a new day..");
                }
            }
            // sout rules
            System.out.println("Hello! Let's start a new day, your current stats are: ");
            System.out.printf("Hole: %d\n", hole);
            System.out.printf("Health: %d\n", health);
            System.out.printf("Weight: %d\n", weight);
            System.out.printf("Respect: %d\n", respect);
            // read action
            System.out.println("Choose what to do today: ");
            System.out.println("#######");
            System.out.println("# 1 #");
            System.out.println("#######");
            Scanner in = new Scanner(System.in);
            userAction = in.nextLine();
            switch (userAction) {
                case "1":
                    // Dig a hole
                    System.out.println("Dig a hole. 1 Intense, 2 Lazy");
                    subAction = in.nextLine();
                    switch (subAction) {
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
                    // Eat some grass
                    System.out.println("It's time to eat! Press 1 to eat fresh grass, press 2 to eat wilted grass");
                    subAction = in.nextLine();
                    switch (subAction) {
                        case "1":
                            // Eat grass: wilted
                            health += 10;
                            weight += 15;
                            break;
                        case "2":
                            // Eat grass: fresh
                            if (respect < 30) {
                                System.out.println("Not so fast, your respect is too low. Get out!");
                                health -= 30;
                            }
                            else if (respect >= 30) {
                                System.out.println("Hello Don Corleone, please eat with us..");
                                health += 30;
                                weight += 30;
                            }
                            break;
                    }
                    break;
                case "3" :
                    // Fight
                    System.out.println("Fight another creature. Press 1 to fight weak,\n press 2 to fight normal,\n press 3 to fight strong");
                    int weightWeakEnemy = 30;
                    int weightNormalEnemy = 50;
                    int weightStrongEnemy = 70;
                    subAction = in.nextLine();
                    double victoryChance;
                    double randomGenerator = new Random().nextDouble();
                    switch (subAction) {
                        case "1":
                            victoryChance = (double)weight/(weightWeakEnemy + (double)weight);
                            if (victoryChance < randomGenerator) {
                                System.out.println("You've lost!");
                            }
                            else {
                                System.out.println("You won!");
                                respect += ((1 - victoryChance) * maxRespect);
                            }
                            break;
                        case "2":
                            victoryChance = (double)weight/(weightNormalEnemy + (double)weight);
                            if (victoryChance < randomGenerator) {
                                System.out.println("You've lost!");
                            }
                            else {
                                System.out.println("You won!");
                                respect += ((1 - victoryChance) * maxRespect);
                            }
                            break;
                        case "3":
                            victoryChance = (double)weight/(weightStrongEnemy + (double)weight);
                            if (victoryChance < randomGenerator) {
                                System.out.println("You've lost!");
                            }
                            else {
                                System.out.println("You won!");
                                respect += ((1 - victoryChance) * maxRespect);
                            }
                            break;
                    }
                    break;
                    // Option for advanced fight mode, more user action required
                    case "4":
                    // Check entry points!

                        System.out.println("###############################################################");
                        System.out.println("#                                                             #");
                        System.out.println("#                                                             #");
                        System.out.println("#                                                             #");
                        System.out.println("#                     YOU ARE UNDER ATTACK                    #");
                        System.out.println("#                    ENEMY HORDE APPROACHES                   #");
                        System.out.println("#           YOU HAVE 5 SECONDS TO DODGE ENEMY'S ATTACK        #");
                        System.out.println("#                                                             #");
                        System.out.println("#                                                             #");
                        System.out.println("#                                                             #");
                        System.out.println("#                                                             #");
                        System.out.println("###############################################################");
                        Date startUserAction = new Date();
                        long start = startUserAction.getTime();
                        subAction = in.nextLine();
                        if (!subAction.equals(null)) {
                            Date endUserAction = new Date();
                            long end = endUserAction.getTime();
                            if ( (end - start) > 5000) {
                                System.out.println("######################################################");
                                System.out.println("                     YOU ARE DEAD"                     );
                                System.out.println("# @@@@@                                        @@@@@ #");
                                System.out.println("#@@@@@@@                                      @@@@@@@#");
                                System.out.println("# @@@@@@@@       @@@@@@@@@@@@@@@@@@@        @@@@@@@@ #");
                                System.out.println("#     @@@@@     @@@@@@@@@@@@@@@@@@@@@     @@@@@      #");
                                System.out.println("#       @@@@@  @@@@@@@@@@@@@@@@@@@@@@@  @@@@@        #");
                                System.out.println("#         @@  @@@@@@@@@@@@@@@@@@@@@@@@@  @@          #");
                                System.out.println("#            @@@@@@@    @@@@@@    @@@@@@             #");
                                System.out.println("#            @@@@@@      @@@@      @@@@@             #");
                                System.out.println("#            @@@@@@      @@@@      @@@@@             #");
                                System.out.println("#             @@@@@@    @@@@@@    @@@@@              #");
                                System.out.println("#              @@@@@@@@@@@  @@@@@@@@@@               #");
                                System.out.println("#               @@@@@@@@@@  @@@@@@@@@                #");
                                System.out.println("#           @@   @@@@@@@@@@@@@@@@@   @@              #");
                                System.out.println("#           @@@@  @@@@ @ @ @ @ @@@@  @@@@            #");
                                System.out.println("#          @@@@@   @@@ @ @ @ @ @@@   @@@@@           #");
                                System.out.println("#        @@@@@      @@@@@@@@@@@@@      @@@@@         #");
                                System.out.println("#      @@@@          @@@@@@@@@@@          @@@@       #");
                                System.out.println("#   @@@@@              @@@@@@@              @@@@@    #");
                                System.out.println("#  @@@@@@@                                 @@@@@@@   #");
                                System.out.println("#   @@@@@                                   @@@@@    #");
                                System.out.println("######################################################");
                                health -= 1000;
                            }
                            else  {
                                System.out.println("You evade an attack!");
                                int enemyHealth = 100;
                                if (enemyHealth > 0) {
                                    System.out.println("Attack an enemy! Press 1 to hit fast (low damage), press 2 to perform power strike (high damage)");
                                    String attackEnemy = "";
                                    attackEnemy = in.nextLine();
                                    double chanceToPerformCriticalHit = new Random().nextDouble();
                                    switch (attackEnemy) {
                                        case "1":
                                            enemyHealth -= 10;
                                            if (chanceToPerformCriticalHit < 0.5) {
                                                System.out.println("You hit for 10 damage");
                                                break;
                                            }
                                            else {
                                                enemyHealth -= 1000;
                                                System.out.println("You performed a critical hit!");
                                            }
                                            break;
                                        case "2":
                                            enemyHealth -= 20;
                                            if (chanceToPerformCriticalHit < 0.5) {
                                                System.out.println("You hit for 20 damage");
                                            }
                                            else if (chanceToPerformCriticalHit >= 0.5) {
                                                enemyHealth -= 1000;
                                                System.out.println("You performed a critical hit!");
                                            }
                                            break;
                                    }

                                }
                            }
                        }
                        break;
            }
            // New day stats changer
            hole -= 2;
            health += 20;
            respect -= 2;
            weight -= 5;
        }
    }
}