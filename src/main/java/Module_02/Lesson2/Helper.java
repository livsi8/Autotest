package Module_02.Lesson2;

public class Helper {
    public static int[] getArray(int length) {
        int[] arr2 = new int[length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 100);
        }
        return arr2;
    }

    public static int[] customSort(int[] arrayIn) {
//        int[] arrayOut = new int[array.length];
        boolean isSorted = false;
        do {
            for (int i = 0; i < arrayIn.length; i++) {
                if (i + 1 != arrayIn.length
                        && arrayIn[i] > arrayIn[i + 1]) {
                    int tempo = arrayIn[i];
                    arrayIn[i] = arrayIn[i + 1];
                    arrayIn[i + 1] = tempo;
                }
            }
            for (int i = 0; i < arrayIn.length; i++) {
                if (i + 1 != arrayIn.length
                        && arrayIn[i] > arrayIn[i + 1]) {
                    isSorted = false;
                    break;
                } else {
                    isSorted = true;
                }
            }
        } while (!isSorted);
        return arrayIn;
    }
}