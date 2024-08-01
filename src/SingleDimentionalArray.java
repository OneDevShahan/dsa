
public class SingleDimentionalArray {

    public int arr[] = null;

    public SingleDimentionalArray(int size) {
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    /**
     * This method is used to insert elemnt to an array.
     * 
     * @param location This is the first paramter to insertIntoArray method
     * @param element  This is the second parameter to insertIntoArray method
     * @return Nothing
     */
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

    /**
     * This method traverse the array.
     * 
     * @param Nothing
     * @return Console out the array elements.
     * 
     */
    public void traverArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
            System.err.println("Array doesn't exists.");
        }
    }

}
