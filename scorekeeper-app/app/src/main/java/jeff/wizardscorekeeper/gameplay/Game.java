package jeff.wizardscorekeeper.gameplay;

public class Game {
    private Player[] players;
    private int numHands, currentHand;

    public Game(Player[] players) {
        this.players = players;
        this.numHands = 60 / players.length;
        this.currentHand = 1;
    }

    public int getCurrentHand() {
        return currentHand;
    }

    public Hand[] newHand(int[] bets) {
        Hand[] hands = new Hand[this.players.length];

        for (int i=0; i<players.length; i++) {
            hands[i] = new Hand(this.players[i], bets[i]);
        }

        return hands;
    }

    public int getNumHands() {
        return numHands;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void updateScores(Hand[] hands, int[] correct) {
        for (int i=0; i<players.length; i++) {
            if (correct[i] == 0) {
                Calculate.correct(hands[i]);
            }
            else {
                Calculate.incorrect(hands[i], correct[i]);
            }
        }
    }
}
