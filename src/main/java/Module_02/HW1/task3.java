package Module_02.HW1;

public class task3 {

    public static void main(String[] args) {
        int[] array = {4, 3, 7, 19, 2, 0, -1};
        System.out.println("Reverse:");
        int[] reverse = reverseArray(array);

        for (int i = 0 ; i <= reverse.length - 1; i++){
            System.out.println(reverse[i]);
        }
    }
    public static int[] reverseArray(int[] array){

        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return array;
    }
}
