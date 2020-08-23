public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new TriangleObserver();
        generator.addObserver(observer1);
        generator.execute();

        NumberGenerator generator2 = new IncrementalNumberGenerator(10, 50, 5);
        Observer observer2 = new TriangleObserver();
        generator2.addObserver(observer2);
        generator2.execute();
    }
}