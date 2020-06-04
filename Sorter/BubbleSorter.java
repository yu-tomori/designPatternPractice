public class BubbleSorter implements Sorter {
    public void sort(Comparable[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 1; j <= data.length - i - 1; j++) {
                if (data[j-1].compareTo(data[j]) > 0) {
                    Comparable passingplace = data[j-1];
                    data[j-1] = data[j];
                    data[j] = passingplace;
                }
            }
        }
    }
}