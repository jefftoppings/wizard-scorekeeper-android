package jeff.wizardscorekeeper.gameplay;

public class Calculate {

    public static void correct(Hand hand) {
        hand.getPlayer().addScore(20 + hand.getBet()*10);
    }

    public static void incorrect(Hand hand, int offBy) {
        hand.getPlayer().addScore(-10*offBy);
    }

}
