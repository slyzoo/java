import java.util.Scanner;

public class main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("you're playing a game, press Q or q to keep playing");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("you're still playing the game");
        }
        else {
            System.out.println("you quit the game");
        }
    }
}
