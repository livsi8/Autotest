package Module_02.HW1;


import java.sql.SQLOutput;

public class task1 {

    public static void main(String[] args) {
        int[] array = {44, 3, 7, 19, 2, 0, -1};
        System.out.println("Max value: " + maxValueArray(array));
    }
        public static int maxValueArray(int[] array){
            int max = array[0];

            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            return max;

        }
    }


