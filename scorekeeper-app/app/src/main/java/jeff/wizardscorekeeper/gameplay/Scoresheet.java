package jeff.wizardscorekeeper.gameplay;

import java.util.ArrayList;

public class Scoresheet {
    ArrayList<String[]> sheet;
    Game game;

    public Scoresheet(Game game, String[] names) {
        this.sheet = new ArrayList<>();
        sheet.add(names);
        this.game = game;
    }

    public void updateScoresheet() {
        // obtain current scores at time of function call
        String[] scores = new String[game.getPlayers().length];
        for (int i=0; i<game.getPlayers().length; i++) {
            scores[i] = Integer.toString(game.getPlayers()[i].score);
        }
        sheet.add(scores);
    }

    public String printScoresheet() {
        String str = "";
        for (int i=0; i<sheet.size(); i++) {
            for (int j=0; j<sheet.size(); j++) {
                str += sheet.get(i)[j] + "\t";
            }
            str += "\n";
        }
        return str;
    }
}
