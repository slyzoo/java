public class main11 {
    public static void main(String[] args) {
//        switch case, a statement that allows a var to e tested fpr equality against a whole list of values

        String day = "monday";

        switch (day) {
            case "monday": System.out.println("it is monday");
            break;
            case "tuesday": System.out.println("it is tuesday");
            break;
            case "wednesday": System.out.println("it is wednesday");
            break;
            case "thursday": System.out.println("it is thursday");
             break;
            case "friday": System.out.println("it is friday");
            break;
            case "saturday": System.out.println("it is saturday");
            break;
            case "sunday": System.out.println("it is sunday");
            break;
            default: System.out.println("that is not a day!");
        }
    }
}
