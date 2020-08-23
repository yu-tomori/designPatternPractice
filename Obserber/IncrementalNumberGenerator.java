public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;
    private int startInt;
    private int endInt;
    private int interval;
    public IncrementalNumberGenerator(int startInt, int endInt, int interval) {
        this.startInt = startInt;
        this.endInt = endInt;
        this.interval = interval;
    }
    public int getNumber() {
        return number;
    }
    public void execute() {
        for (int i = startInt; i <= endInt; i += interval) {
            number = i;
            notifyObservers();
        }
    }
}