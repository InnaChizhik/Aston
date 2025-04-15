package Lesson_6;

class Methods {
    public static int arraySize(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (4 != array.length) throw new MyArraySizeException("Размер массива должен быть 4");
        for (int i = 0; i < array.length; i++) {
            if (4 != array[i].length) throw new MyArraySizeException("Размер массива должен быть 4");
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в ячейке " + i + " " + j);
                }
            }
        }
        return sum;
    }
}

