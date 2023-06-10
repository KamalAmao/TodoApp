
import java.util.Random;
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        double randomNumber = random.nextDouble(); // 0.0 and 1.0
        System.out.println("The random number is " + randomNumber);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random boolean type is " + randomBoolean);

        int randomScore = random.nextInt(100);
        System.out.println("Your score is " + randomScore);

        int diceOne = 1 + random.nextInt(6);
        int diceTwo = 1 + random.nextInt(6);

        System.out.println("Computer Rolled " + diceOne + " for first dice\nThen rolled " + diceTwo + " for second dice");
    }
}
