import framework.*;
import idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("友利有佑");
        Product card2 = factory.create("椎名林檎");
        Product card3 = factory.create("えっちゃん");
        card1.use();
        card2.use();
        card3.use();
    }
}