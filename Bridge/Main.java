public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        CountDisplay d4 = new CountDisplay(new StringDisplayImpl("Hello, Yu!"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
        d4.randomDisplay(10);

        CountDisplay d5 = new CountDisplay(new FileDisplayImpl("star.txt"));
        d5.display();
    }
}