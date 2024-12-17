import java.util.Random;

public class MegaSenaWhile {
    public static void main(String[] args){
        Random generate = new Random();

        //while (true) -> looping infinito

        //while (i < 6) -> looping ate 6

        int i = 0;
        while (i < 6) {
            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
        }
    }
}
