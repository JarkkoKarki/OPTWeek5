
import org.junit.Test;

import static org.junit.Assert.*;


public class DiceTest {

    @Test
    public void testRollDiceWithinRange() {
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int value = dice.rollDice();
            assertTrue(value >= 1 && value <= 6);
        }
    }

    @Test
    public void testRollTwoDiceReturnsBoolean() {
        Dice dice = new Dice();
        boolean result = dice.rollTwoDice();
        assertNotNull(result);
    }

    @Test
    public void testRollsUntilDoubleEventuallySucceeds() {
        Dice dice = new Dice();
        int attempts = dice.rollsUntilDouble();
        assertTrue(attempts >= 1);
    }
}
