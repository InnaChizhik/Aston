package Lesson_6;

class Methods {
    public static void arraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4х4");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4х4");
            }
        }
        System.out.println("Массив задан верно");
    }
}
