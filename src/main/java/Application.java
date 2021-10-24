import java.io.IOException;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Array array = new Array();
        String[][] tmp = {
                {"1", "2", "0", "4"},
                {"5", "6", "7", "8"},
                {"9", "0", "0", "0"},
                {"0", "0", "0", "0"}
        };

        try {
            array.initArray(tmp);
            array.printArray();
            int sum = array.sumOfArrayElements();
            System.out.println("Сумма элементов массива sum = " + sum);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
