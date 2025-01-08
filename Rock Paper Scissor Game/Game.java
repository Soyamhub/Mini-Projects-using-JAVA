
import java.util.*;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain;
        do {
            String handSign = "";

            while (true) {
                System.out.println("Your turn(Rock,Paper,Scissor)");
                handSign = sc.next();
                if (handSign.equals("Rock") || handSign.equals("Paper") || handSign.equals("Scissor")) {
                    break;
                } else {
                    System.out.println("Invalid input ! Enter again.");
                }
            };

            String[] choices = {"Rock", "Paper", "Scissor"};
            Random randomNo = new Random();
            int computerIndex = randomNo.nextInt(3);
            String computerChoice = choices[computerIndex];
            System.out.println("Computer chose: " + computerChoice);

            if (computerChoice.equals(handSign)) {
                System.out.println("Draw");
            } else if ((computerChoice.equals("Rock") && handSign.equals("Paper")) || (computerChoice.equals("Paper") && handSign.equals("Scissor")) || (computerChoice.equals("Scissor") && handSign.equals("Rock"))) {
                System.out.println("You Win.");
            } else if ((computerChoice.equals("Paper") && handSign.equals("Rock")) || (computerChoice.equals("Scissor") && handSign.equals("Paper")) || (computerChoice.equals("Rock") && handSign.equals("Scissor"))) {
                System.out.println("You Lose.");
            }

            System.out.println("Do you want to play again ?(Y/N)");
            char retry = sc.next().charAt(0);
            playAgain = (retry == 'Y' || retry == 'y');
        } while (playAgain);
    }
}
