public class TwoDimensionalArray {

    int[][] arr = null;
    public TwoDimensionalArray(int numOfRow, int numOfCol) {
        this.arr = new int[numOfRow][numOfCol];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }


    /**
     * This method insert the value to specified index by row and col
     * @param row
     * @param col
     * @param val
     * 
     * @return Nothing
     *
    */
    public void insertIntoArray(int row, int col, int val) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = val;
                System.out.println("Value inserted successfully.");
            } else {
                System.out.println("Cell is not free.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid index provided.");
        }
    }
    
    /**
     * This method console out the value by index with row and col
     * 
     * @param row
     * @param column
     * @return Nothing
     * 
     * */
    public void accessValue(int row, int column) {
        System.out.println(" Row " + row + " Col" + column);
        try {
            System.out.println(" " + arr[row][column]);
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }
    
    /**
     * This method traverse the all element into the two dimensional array
     * 
     */
    
    public void traverseArray() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    

    /**
     * This method searches value provided
     * 
     * @param value
     * @return Nothing, console out if found
     */

    public void searchElement(int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value is present");
                    return;
                }
            }
        }
        System.out.println("Value is not present.");
    }

    /**
     * This method deletes element at index by row and column
     * @param row
     * @param column
    */

    public void deleteElement(int row, int column) {
        try {
            System.out.println("Deleted succesfully " + arr[row][column]);
            arr[row][column] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid index provided.");
        }
    }

    
}