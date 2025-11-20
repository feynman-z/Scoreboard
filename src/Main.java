import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int read() throws IOException {
        int points_one = 0;
        int points_two = 0;
        int active = 1;
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        while (s.hasNext()) {

            if ((s.hasNextInt())) {
                if (s.nextInt() != 0) {
                    points_one +=
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