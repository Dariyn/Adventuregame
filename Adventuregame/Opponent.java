public class Opponent {
    private Scan choice;
    private Successor ruler;
    public Opponent(Scan n, Successor m) {
        choice = n;
        ruler = m;
    }
    public int opponentchoice() {
        System.out.println("Option 1: There is one tough guy upfront!");
        System.out.println("Option 2: There is a bunch of small guys over to the right!");
        choice.parseOption(false);
        int result = choice.parseOption(true);
        if (result == 1) {
            System.out.println("You are attacking the tough guy");
            choice.parseOption(false);
            System.out.println("You are victorious!");
            choice.parseOption(false);
            ruler.reaction();
            return 0;
        }
        else {
            System.out.println("You are attacking the small guys");
            choice.parseOption(false);
            System.out.println("You are victorious!");
            choice.parseOption(false);
            ruler.reaction();
            return 0;
        }
    }
}