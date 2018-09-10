public class Userchoosepath {
    private Scan choice;
    private ending end;
    public Userchoosepath(Scan n, ending m) {
        choice = n;
        end = m;
    }
    public int choosePath() {
        System.out.println("Option 1: The long way?");
        System.out.println("Option 2: The shortcut?");
        choice.parseOption(false);
        int result = choice.parseOption(true);
        if (result == 1) {
            System.out.println("The long way is always safer!");
            choice.parseOption(false);
            end.Peace();
            return 0;
        }
        else {
            System.out.println("Shortcuts are ways more dangerous!");
            end.Coward();
            return 0;
        }
    }
}