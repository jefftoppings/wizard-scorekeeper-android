package jeff.wizardscorekeeper.gameplay;

public class Player {

    String name;
    int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public int getScore() {
        return score;
    }

     public String getName() {
        return name;
     }
}
