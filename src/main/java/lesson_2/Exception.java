package lesson_2;

import java.util.Arrays;

public class Exception {
    public static void main(String[] args) throws MyArrayDataException {
        String[][] Arr1 = new String[][]{
                {"202", "33", "11", "1"},
                {"7",  "88", "2"},
                {"11", "77", "99", "2"},
                {"55", "55", "33", "9"}
        };

        try {
            try {
                int result = checkingSize(Arr1);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Массив не поддерживает требуемый размер");
            }
        }
        catch (MyArrayDataException e) {
            int symm = 0;
            System.out.println("найден элемент массива- не число");
            System.out.println("Ошибка - адрес " + e.i + " x " + e.j);


        }
    }
    public static int checkingSize(String[][] Arr1) throws MyArraySizeException, MyArrayDataException {
        int symm = 0;
        for (int i = 0; i < Arr1.length; i++) {
            if (Arr1[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < Arr1[i].length; j++) {
                try {
                    symm = symm + Integer.parseInt(Arr1[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

      return symm;

    }
}










