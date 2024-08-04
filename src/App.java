
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        SingleDimensionalArray array = new SingleDimensionalArray(5);
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

        TwoDimensionalArray twoDArr = new TwoDimensionalArray(3, 3);
        System.out.println("<=========== Insert Method =========>");
        twoDArr.insertIntoArray(0, 1, 3);
        twoDArr.insertIntoArray(2, 3, 1);
        twoDArr.insertIntoArray(1, 2, 4);
        twoDArr.insertIntoArray(3, 0, 9);
        System.out.println(Arrays.deepToString(twoDArr.arr));
        System.out.println("<=========== Access Method =========>");
        twoDArr.accessValue(1, 2);
        System.out.println("<=========== Traverse Method =========>");
        twoDArr.traverseArray();
        System.out.println("<=========== Search Method =========>");
        twoDArr.searchElement(4);
        System.out.println("<=========== Delete Method =========>");
        twoDArr.deleteElement(0, 1);
    }
}
