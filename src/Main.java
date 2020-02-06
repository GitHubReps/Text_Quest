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
            System.out.println("1 - hole, 2 - eat, 3 - fight, 4 - fight (advanced)");
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
                        short enemyHealth = 100;
                        final short basicAttackValue = 10;
                        final short criticalAttackValue = (basicAttackValue * 2);
                        String evadeAttack = "1";
                        String parryAttack = "2";
                        String defenceOption = "";
                        String attackOption = "";
                        String performAttack = "1";
                        while ( (enemyHealth > 0) && (health > 0) ) {
                            System.out.println("###############################################################");
                            System.out.println("#                                                             #");
                            System.out.println("#                                                             #");
                            System.out.println("#                 YOUR ENEMY CHARGES FOR AN ATTACK            #");
                            System.out.println("#           YOU HAVE 5 SECONDS TO DODGE ENEMY'S ATTACK        #");
                            System.out.println("#                    OR YOU ARE GOING TO DIE                  #");
                            System.out.println("#                                                             #");
                            System.out.println("#                                                             #");
                            System.out.println("###############################################################");
                            System.out.println("#                                                             #");
                            System.out.println("###############################################################");
                            System.out.println("#                                                             #");
                            System.out.println("#                                                             #");
                            System.out.println("#       #################              #################      #");
                            System.out.println("#       #     PRESS     #              #     PRESS     #      #");
                            System.out.println("#       #               #              #               #      #");
                            System.out.println("#       #       11      #              #      2222     #      #");
                            System.out.println("#       #    11 11      #              #    22    22   #      #");
                            System.out.println("#       #  11   11      #              #   22     22   #      #");
                            System.out.println("#       #       11      #              #        22     #      #");
                            System.out.println("#       #       11      #              #     22        #      #");
                            System.out.println("#       #       11      #              #   222222222   #      #");
                            System.out.println("#       #               #              #               #      #");
                            System.out.println("#       #    TO DODGE   #              #    TO PARRY   #      #");
                            System.out.println("#       #################              #################      #");
                            System.out.println("#                                                             #");
                            System.out.println("#                                                             #");
                            System.out.println("#                                                             #");
                            System.out.println("###############################################################");
                            defenceOption = in.nextLine();
                            if (defenceOption.equals(evadeAttack)) {
                                System.out.println("###############################################################");
                                System.out.println("#                                                             #");
                                System.out.println("#                                                             #");
                                System.out.println("#                      YOUR ENEMY MISSED                      #");
                                System.out.println("#                 YOU HAVE 3 SECONDS TO ATTACK                #");
                                System.out.println("#                                                             #");
                                System.out.println("#                     #################                       #");
                                System.out.println("#                     #     PRESS     #                       #");
                                System.out.println("#                     #               #                       #");
                                System.out.println("#                     #       11      #                       #");
                                System.out.println("#                     #    11 11      #                       #");
                                System.out.println("#                     #  11   11      #                       #");
                                System.out.println("#                     #       11      #                       #");
                                System.out.println("#                     #       11      #                       #");
                                System.out.println("#                     #       11      #                       #");
                                System.out.println("#                     #               #                       #");
                                System.out.println("#                     #   TO ATTACK   #                       #");
                                System.out.println("#                     #################                       #");
                                System.out.println("#                                                             #");
                                System.out.println("#                                                             #");
                                System.out.println("###############################################################");
                                attackOption = in.nextLine();
                                if (attackOption.equals(performAttack)) {
                                    double chanceToPerformCriticalHit = new Random().nextDouble();
                                    if (chanceToPerformCriticalHit < 0.5) {
                                        enemyHealth -= basicAttackValue;
                                        System.out.printf("You hit for %d damage",basicAttackValue);
                                        break;
                                    }
                                    else if (chanceToPerformCriticalHit >= 0.5) {
                                        enemyHealth -= criticalAttackValue;;
                                        System.out.printf("You hit for %d damage", criticalAttackValue);
                                        break;
                                    }
                                }
                                else if (!attackOption.equals(performAttack)) {
                                    System.out.println("You've missed!");
                                }
                            }
                            else if (defenceOption.equals(parryAttack)) {
                                health /= 2;
                                health -= basicAttackValue;
                                System.out.println("###############################################################");
                                System.out.println("#                                                             #");
                                System.out.println("#                                                             #");
                                System.out.println("#                      YOU PARRY AN ATTACK                    #");
                                System.out.println("#             YOU HAVE LOST 50% OF YOUR HEALTH POINTS         #");
                                System.out.println("#    AND RECEIVED ADDITIONAL 10 DAMAGE TO YOUR HEALTH POINTS  #");
                                System.out.println("#                                                             #");
                                System.out.println("#                                                             #");
                                System.out.println("###############################################################");
                                System.out.println("#                                                             #");
                                System.out.println("#                                                             #");
                                System.out.println("#                 YOU HAVE 3 SECONDS TO ATTACK                #");
                                System.out.println("#                                                             #");
                                System.out.println("#                     #################                       #");
                                System.out.println("#                     #     PRESS     #                       #");
                                System.out.println("#                     #               #                       #");
                                System.out.println("#                     #       11      #                       #");
                                System.out.println("#                     #    11 11      #                       #");
                                System.out.println("#                     #  11   11      #                       #");
                                System.out.println("#                     #       11      #                       #");
                                System.out.println("#                     #       11      #                       #");
                                System.out.println("#                     #       11      #                       #");
                                System.out.println("#                     #               #                       #");
                                System.out.println("#                     #   TO ATTACK   #                       #");
                                System.out.println("#                     #################                       #");
                                System.out.println("#                                                             #");
                                System.out.println("#                                                             #");
                                System.out.println("###############################################################");
                                attackOption = in.nextLine();
                                if (attackOption.equals(performAttack)) {
                                    double chanceToPerformCriticalHit = new Random().nextDouble();
                                    if (chanceToPerformCriticalHit < 0.5) {
                                        enemyHealth -= basicAttackValue;
                                        System.out.printf("You hit for %d damage",basicAttackValue);
                                        break;
                                    }
                                    else if (chanceToPerformCriticalHit >= 0.5) {
                                        enemyHealth -= criticalAttackValue;;
                                        System.out.printf("You hit for %d damage", criticalAttackValue);
                                    }
                                }
                            }
                        }
                        if ( health <= 0) {
                            System.out.println("######################################################");
                            System.out.println("#                     YOU ARE DEAD                   #");
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
                            break;
                        }
                        else if (enemyHealth <= 0) {
                                System.out.println("######################################################");
                                System.out.println("#              YOUR ENEMY WAS DEFEATED!              #");
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
                                respect += 1000;
                                break;
                            }
                        return;
                    }
            }
            // New day stats changer
            hole -= 2;
            health += 20;
            respect -= 2;
            weight -= 5;
        }
}