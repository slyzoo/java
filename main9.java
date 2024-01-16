import java.util.Random;
public class main9 {
    public static void main(String[] args) {
        Random random = new Random();

//        random int
        int random_number_int = random.nextInt(10);
        System.out.println(random_number_int);

//        random double
        double random_number_double = random.nextDouble(10);
        System.out.println(random_number_double);

//        random boolean
        boolean random_true_or_false = random.nextBoolean();
        System.out.println(random_true_or_false);
    }
}
