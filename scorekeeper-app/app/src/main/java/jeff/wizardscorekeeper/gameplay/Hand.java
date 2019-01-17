package jeff.wizardscorekeeper.gameplay;

public class Hand {
    private Player player;
    private int bet;

    public Hand(Player player, int bet) {
        this.player = player;
        this.bet = bet;
    }

    public int getBet() {
        return bet;
    }

    public Player getPlayer() {
        return player;
    }
}
