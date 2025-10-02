import java.util.Random;

public class Dice {
    private Random random;

    public Dice() {
        this.random = new Random();
    }

    public int rollDice() {
        return random.nextInt(6) + 1;
    }

    public boolean rollTwoDice() {
        int die1 = rollDice();
        int die2 = rollDice();
        System.out.println(die1 + " and " + die2);

        if (die1 == die2) {
            System.out.println("You rolled a double!");
            return true;
        } else {
            System.out.println("Try again.");
            return false;
        }
    }
    public int rollsUntilDouble() {
        int count = 0;
        boolean isDouble;
        do {
            count++;
            isDouble = rollTwoDice();
        } while (!isDouble);
        return count;
    }
}
