
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        SingleDimentionalArray array = new SingleDimentionalArray(5);
        array.insertIntoArray(2, 3);
        array.insertIntoArray(3, 5);
        array.insertIntoArray(1, 50);
        array.insertIntoArray(4, 2);
        array.insertIntoArray(0, 3);
        array.insertIntoArray(10, 3);
        Arrays.toString(array.arr);

        array.traverArray();
        array.searchElement(50);
        array.deleteElement(1);
    }
}
