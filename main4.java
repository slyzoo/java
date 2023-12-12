import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//          question #1
        System.out.println("what is your name?");
        String name = scanner.nextLine();
//          question #2
        System.out.println("how old are you?");
        int age = scanner.nextInt();

//        only here bc of a bug with ints
        scanner.nextLine();

//          question #3
        System.out.println("what is your fav food?");
        String food = scanner.nextLine();

//        answer #1
        System.out.println("hello "+name);

//        answer #2
        System.out.println("you are "+age+" years old");

//        answer #3
        System.out.println(food+" is a good food");

    }
}
