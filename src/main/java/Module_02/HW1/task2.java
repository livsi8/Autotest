package Module_02.HW1;
import java.util.Arrays;

public class task2 {

    public static void main(String[] args) {
        int[] array = {4, 3, 7, 19, 2, 0, -1};
        Arrays.sort(array);
        for (int i = array.length - 3; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

