public class main7 {
    public static void main(String[] args) {
        double pi = 3.14591;
        double neg_ten = -10;
        double six = 6.21;

//        finds greater of two values
        double max = Math.max(pi, neg_ten);
        System.out.println("the max is "+max);

//        finds lesser of two values
        double min = Math.min(pi, neg_ten);
        System.out.println("the min is "+min);

//      finds the absolute value
        double absolute_value = Math.abs(neg_ten);
        System.out.println("the absolute value is "+absolute_value);

//      finds the square root of a number
        double square_root = Math.sqrt(six);
        System.out.println("the square root is "+square_root);

//      rounds a number
        double rounding = Math.round(six);
        System.out.println(rounding);


//      rounds a number up
        double ceiling = Math.ceil(six);
        System.out.println(ceiling);

//      rounds a number down
        double floor = Math.floor(six);
        System.out.println(floor);
    }
}
