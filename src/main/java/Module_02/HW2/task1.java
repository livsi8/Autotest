package Module_02.HW2;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

        String string = "Determine how often a particular character occurs in a string";
        String[] array = string.split("");
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {


            array2[i] = array[i].indexOf("e");


        }
        System.out.println(Arrays.toString(array2));

    }


}
