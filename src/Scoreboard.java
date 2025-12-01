public class Scoreboard {

    String team_one;
    String team_two;

    String active_team = team_one;

    int team_one_score;
    int team_two_score;

    public Scoreboard(String team_one, String team_two) {

    }
    public static void recordPlay(int points_scored) {
        if (points_scored > 0) {
            if (active_team == team_one) {
                team_one_score += points_scored;
            }
            else if (active_team == team_two) {
                team_two_score += points_scored;
            }
        }
        else if (points_scored == 0) {
            if (active_team == team_one) {
                active_team = team_two;
            }
            else if (active_team == team_two) {
                active_team = team_one;
            }
        }
    }
    public static String getScore() {
        return team_one_score + "-" + team_two_score + "-" + active_team;
    }

}
