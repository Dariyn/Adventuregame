import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        System.out.println("???: Welcome to a textbased adventure game");
        entcont enter = new entcont();
        Scan name = new Scan(enter);
        ending end = new ending();
        Userchoosepath paths = new Userchoosepath(name, end);
        Successor ruler = new Successor(name,end);
        Opponent enemy = new Opponent(name,ruler);
        Userweaponchoice weapon = new Userweaponchoice(name,enemy);
        Scanner userInput = new Scanner(System.in);
        System.out.println("???: First let me know your name!");
        String userName = userInput.next();
        userInput.close();
        System.out.println("???: Ah! So your name is " + userName);
        name.parseOption(false);
        System.out.println("???: Welcome to tribe of Ducks, my name is Dolan!");
        name.parseOption(false);
        Scanner Reason = new Scanner(System.in);
        System.out.println("Dolan: What brought you here to the land of memes?");
        String reason = Reason.next();
        Reason.close();
        System.out.println("Dolan: So it may be");
        name.parseOption(false);
        System.out.println("An army suddenly appeared and surrounded the tribe");
        name.parseOption(false);
        System.out.println("Dolan: Oh, that must be the army of the elite force");
        name.parseOption(false);
        System.out.println("Would you help us in this war?");
        Suddenattack sattack = new Suddenattack(name, weapon, paths);
        sattack.action();
        
        

        
        
        
        
        
        
        
    }
}