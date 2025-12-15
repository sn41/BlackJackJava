public class Card {
    String suit;
    String name;
    Card(String suit, String name){
        this.suit = suit;
        this.name = name;
    }
    public void draw() {
        String d = name;
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
