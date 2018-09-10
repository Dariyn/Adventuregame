import java.util.Scanner;
public class Scan {
    private Scanner userInput;
    private entcont enter;
    public Scan(entcont n) {
         userInput = new Scanner(System.in);
         enter = n;
    }
    public int parseOption(boolean twoOption){
        if (twoOption) {
            System.out.println("Would you choose option 1 or option 2?");
            int result = userInput.nextInt();
            if (result == 1 || result == 2) {
                return result;
            }
            else {
              return 0;
            }
        }
        else {
            enter.enter();
            return 0;
        }
        
    }
}
