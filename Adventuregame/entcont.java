import java.util.Scanner;
public class entcont {
    public void enter() {
        Scanner entcont = new Scanner(System.in);
        System.out.println("Press enter to continue");
        String blank = entcont.nextLine();
        entcont.close();
    }
}