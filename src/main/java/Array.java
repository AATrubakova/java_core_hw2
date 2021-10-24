public class Array {
    String[][] array;

    public Array() {
        this.array = new String[4][4];
    }

    public void initArray(String[][] array) throws MyArraySizeException {
        if (this.array.length != array.length || this.array[0].length != array[0].length) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                this.array[i][j] = array[i][j];
            }
        }
    }

    public  int sumOfArrayElements() throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }

            }
        }
        return sum;
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException () {
        super("Не соответствует размерность входного массива");
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException (int row, int col) {
        super("В ячейке [" + row + "][" +  col + "] некорректные данные");
    }
}
