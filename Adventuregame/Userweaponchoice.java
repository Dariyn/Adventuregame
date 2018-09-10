public class Userweaponchoice {
    private Scan choice;
    private String weapon;
    private Opponent enemy;
    public Userweaponchoice(Scan n,Opponent m) {
        choice = n;
        enemy = m;
    }
    public int weaponchoice() {
        System.out.println("Option 1: A sword, it is good for fighting against a crowd of enemies");
        System.out.println("Option 2: An axe, it is good for fighting a huge enemy");
        choice.parseOption(false);
        int result = choice.parseOption(true);
        if (result == 1) {
            System.out.println("Dolan: You have chosen a sword!");
            weapon = "Sword";
            enemy.opponentchoice();
            return 0;
        }
        else {
            System.out.println("Dolan: You have chosen an axe!");
            weapon = "Axe";
            enemy.opponentchoice();
            return 0;
        }
    }
    
}