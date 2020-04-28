package Module_02.Lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class lesson1 {

    public static void main(String[] args) {
        // не инициализ
        //  int [] arr;
        // arr = new int [5]; //[0,0,0,0,0]
        // инициализ
        //    int[] arr2 = {12, 14, 1, 98};
        //    System.out.println(arr2[0]); // выведет конкретное число массива.


        //Добавление чисел в массив

        // наполнение массива только в чётные

        // int[] arr = new int[10];
        // for (int i = 0; i < 10; i++) {
        //     if (i % 2 == 0) {
        //         arr[i] = i;
        //         System.out.println(arr[i]);
        //     }
        // }


        //  int[] arr = new int[10];
        //  for (int i = 0; i <= arr.length; i++) {
        //      arr[i] = i;
        //      System.out.println(arr [arr.length - 1]);
        //      }


        //несколько массивов в массиве

        // int [] [] arr2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        // int [] [] arr3 = new int[][]{};
        // int [] [] arr4 = new int[5][]; // 5 массивов в массиве

        //3 x 3 массив, набить данными и вывести

        int[][] arr2 = new int[2][10]; //массив 3 х 3
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = j;
            }
        }
        System.out.println(Arrays.deepToString(arr2));
    }


}
