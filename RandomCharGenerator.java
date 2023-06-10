
import java.util.Random;
public class RandomCharGenerator {
    public static void main(String[] args) {
        //ASCII - A - Z: 65 - 91, a - z: 97 -
        /*System.out.println('b' + 'i' + 't');
        System.out.println(1 + 'a');*/

        Random random = new Random();
        char randomChar = (char) (random.nextInt(26) + 'a');
        System.out.println(randomChar);
        /*Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);*/
    }
}
