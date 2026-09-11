import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        prithee();
    }
    public static void prithee() {
        String sonnet = """
            Shall I compare thee to a summer’s day?
            Thou art more lovely and more temperate:
            Rough winds do shake the darling buds of May,
            And summer’s lease hath all too short a date;
            Sometime too hot the eye of heaven shines,
            And often is his gold complexion dimm’d;
            And every fair from fair sometime declines,
            By chance or nature’s changing course untrimm'd;
            But thy eternal summer shall not fade,
            Nor lose possession of that fair thou ow’st;
            Nor shall death brag thou wander’st in his shade,
            When in eternal lines to time thou grow’st:
            So long as men can breathe or eyes can see,
            So long lives this, and this gives life to thee.
            """;
        String[] sonnetArr = sonnet.trim().split("\\s+");
        int numCorrect = 0;
        int numWrong = 0;
        int length = sonnetArr.length;
        String display = "";
        Random random = new Random();
        while (numCorrect < 3 && numWrong < 3) {
            Integer randIdx = random.nextInt(1, length);
            System.out.println(randIdx);
            for (int i = 0; i < randIdx; i++) {
                display += (sonnetArr[i] + " ");
                if (i % 10 == 0 && i > 0) {
                    display += "\n";
                }
            }
            System.out.println(display);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Guess the next word: ");
            String guess = scanner.nextLine();
            if (guess.equals(sonnetArr[randIdx])) {
                System.out.println("Correct!");
                numCorrect += 1;
            } else {
                System.out.println("Incorrect!");
                System.out.println("The correct word was: " + sonnetArr[randIdx]);
                numWrong += 1;
            }
            if (numCorrect < 3 && numWrong < 3) {
                System.out.println("You have made " + numCorrect + " correct guess(es) and " + numWrong + " incorrect guess(es)! Keep playing!");
            } else if (numCorrect == 3) {
                System.out.println("You win! You have made " + numCorrect + " correct guesses");
                break;
            } else {
                System.out.println("You lose! You have made " + numWrong + " incorrect guesses!");
                break;
            }
            display = "";
        }
    }
}
