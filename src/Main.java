import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int read() throws IOException {
        int points_one = 0;
        int points_two = 0;
        int active = 1;
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);

        while (s.hasNext()) { // Check for next anything.
            Scoreboard game = new Scoreboard(s.next(), s.next());
            if ((s.hasNextInt())) { // Check for next integer.
                if (s.nextInt() != 0) {
                    points_one += s.nextInt(); // Might not work

                }
            }
            else {
                str team_one = s.next();
                str team_two = s.next();
            }
        }
    }



    public static void main(String[] args) {

    }
}