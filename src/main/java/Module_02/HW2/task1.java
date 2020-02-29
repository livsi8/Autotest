package Module_02.HW2;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

        String string = "Determine how often a particular character occurs in a string";
        char[] array = string.toCharArray();
        char[] array2 = new char[array.length];
        String chars;
        int counter = 0;
        for(char char1 : array){

            for(char char2 : array){

                if(char1 == char2){
                        ++counter;
                    System.out.println(char1);
                    }
                }
            }

        }
       // System.out.println(Arrays.toString(array));

    }



