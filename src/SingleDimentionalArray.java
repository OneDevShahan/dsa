
public class SingleDimentionalArray {

    public int arr[] = null;

    public SingleDimentionalArray(int size) {
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insertIntoArray(int location, int element) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = element;
                System.err.println("Successfully inserted.");
            } else {
                System.err.println("This cell is occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid location passed.");
        }
    }
}
