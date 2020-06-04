public class Main {
    public static void main(String[] args) {
        String[] data = {
            "Dumpty", "Bowman", "Carrol", "Elfland", "Alice",
        };
        SortAndPrint sap = new SortAndPrint(data, new BubbleSorter());
        sap.execute();
    }
}