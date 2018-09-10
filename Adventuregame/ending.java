public class ending {
    public String Hero() {
        System.out.println("You have become the ruler of the tribe of ducks!");
        System.out.println("You became a good ruler, and the people to prosperity.");
        System.out.println("Achievement: Heroic ending!");
        return "heroic";
    }
    public String Evilruler() {
        System.out.println("You took the place as the ruler!");
        System.out.println("You forgot who you are, and ruled the people with an iron fist");
        System.out.println("You were soon killed by the people!");
        System.out.println("Achievement: Evilruler ending!");
        return "evilruler";
    }
    public String Coward() {
        System.out.println("YOU DIED!");
        System.out.println("You are a dumb coward!");
        System.out.println("Achievement: Coward!");
        return "Coward";
    }
    public String Peace() {
        System.out.println("Got away safely!");
        System.out.println("Achievement: Peaceout!");
        return "peace";
    }
}