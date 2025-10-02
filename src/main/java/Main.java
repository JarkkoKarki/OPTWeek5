public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int rolls = dice.rollsUntilDouble();
        System.out.println("Throws: " + rolls + " times.");
    }
}
