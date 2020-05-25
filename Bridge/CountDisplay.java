import java.util.concurrent.ThreadLocalRandom;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
    public void randomDisplay(int times) {
        open();
        int num = ThreadLocalRandom.current().nextInt(0, times);
        for (int i = 0; i < num; i++) {
            print();
        }
        close();
    }
}