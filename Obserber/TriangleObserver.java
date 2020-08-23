public class TriangleObserver implements Observer {
    public void update(NumberGenerator generator) {
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("/\\");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}