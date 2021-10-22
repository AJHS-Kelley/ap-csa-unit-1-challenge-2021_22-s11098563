// Connor Cook, AP CSA Unit 1 Challenge, Andrew Jackson High School, 10-22-2021, 9:18am, v0.9
// Peer Debugging, Maxx Secrest
import java.util.Scanner;

public class DamageDealt {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        // Weapon used
        System.out.println("What weapon are you using?");
        String weapon = myScanner.nextLine();

        // Monster attacked
        System.out.println("What monster is being attacked?");
        String monster = myScanner.nextLine();

        // Number of attacks
        System.out.println("How many attacks will you make with your " + weapon + "?");
        Integer numAttacks = myScanner.nextInt();

        // Damage per attack
        System.out.println("How much damage will each attack do?");
        Double damage = myScanner.nextDouble();

        // Total damage during combat
        Double totalDmg = numAttacks * damage;
        System.out.println("You did " + totalDmg + " damage to the " + monster + " with your " + weapon);

    }
}