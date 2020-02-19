package Module_02.Lesson2;
import java.util.Arrays;
public class lesson2 {

    public static void main(String[] args) {
        System.out.println("Дан массив: ");
        int[] arr = Helper.getArray(10);
        System.out.println(Arrays.toString(arr));
        int[] sortedArr = Helper.customSort(arr);
        for (int i = sortedArr.length - 3; i < sortedArr.length; i++) {
            System.out.println(sortedArr[i]);
        }

    }
}
