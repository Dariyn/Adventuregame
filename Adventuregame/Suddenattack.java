public class Suddenattack {
    private Scan choice;
    private Userweaponchoice weapon;
    private Userchoosepath paths;
    public Suddenattack(Scan n, Userweaponchoice m, Userchoosepath o) {
        choice = n;
        weapon = m;
        paths = o;
    }
    public int action() {
        System.out.println("Option 1:Stay and fight for the ducks");
        System.out.println("Option 2:Leave the place");
        choice.parseOption(false);
        int result = choice.parseOption(true);
        if (result == 1) {
            System.out.println("Dolan: Thank you!");
            choice.parseOption(false);
            weapon.weaponchoice();
            return 0;
        }
        else {
            System.out.println("Dolan: Hope I would see you in the future. Farewell!");
            paths.choosePath();
            return 0;
        }
    }
}