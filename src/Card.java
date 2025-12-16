public class Card {
    String suit;
    String value;
    int points;

    Card(String cardSuit, String cardValue, int cardPoints){
        suit = cardSuit;
        value = cardValue;
        points = cardPoints;
    }

    public void draw() {
        String d = value;
        String m = suit;
        System.out.println("┌────┐");
        System.out.println("│"+d+" "+m+"│");
        System.out.println("│    │");
        System.out.println("│ "+m+"  │");
        System.out.println("│    │");
        System.out.println("│"+m+" "+d+"│");
        System.out.println("└────┘");
    }
}
