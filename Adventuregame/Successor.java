public class Successor {
    private Scan choice;
    private ending end;
    public Successor(Scan n, ending m) {
        choice = n;
        end = m;
    }
    public int reaction() {
        System.out.println("Dolan: Thank you for saving the tribe!");
        System.out.println("Option 1: Be proud and be ruler!");
        System.out.println("Option 2: Be humble and stay as a soldier");
        choice.parseOption(false);
        int result = choice.parseOption(true);
        if (result == 1) {
            System.out.println("Dolan: All hail the new King!");
            end.Evilruler();
            choice.parseOption(false);
        }
        else {
            System.out.println("Dolan: The people would like to be ruled by you!");
            end.Hero();
            choice.parseOption(false);
        }
        return 0;
    }
}