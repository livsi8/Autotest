package Module_02.Lesson3;

import java.util.Arrays;

public class taskob {


    public static void main(String[] args) {

        String string = "Hello, world! My name is Yehor ";
        String[] array = string.split(" ");
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i].length();
        }
        System.out.println(Arrays.toString(array2));
    }

}
