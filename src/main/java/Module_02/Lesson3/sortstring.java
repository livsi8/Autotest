package Module_02.Lesson3;

import java.util.Arrays;

public class sortstring {
    public static void main(String[] args) {
        String sentence = "Hello, world! My name is Yehor";
        String[] array = sentence.split(" ");

        for(int i = 0; i < array.length - 1; i++) {
            if(array[i].length() < array[i + 1].length()){
              String array2 = array[i + 1];
               array[i] = array2;
         //       System.out.println(Arrays.toString(array2));
            }

        }
        System.out.println(Arrays.toString(array));
    }

    }
