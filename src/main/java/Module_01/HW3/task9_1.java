package Module_01.HW3;
import org.omg.CORBA.WStringSeqHelper;

import java.util.Scanner;
public class task9_1 {

    public static void main(String[] args){

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите 3 начания:");
        int number1 = scan1.nextInt();
        int number2 = scan1.nextInt();
        int number3 = scan1.nextInt();
        scan1.close();
        if (number1 < number2 & number1 < number3){
            System.out.println(number1);}
        else if (number2 < number3 & number2 < number1)
            System.out.println(number2);

        else System.out.println(number3);

    }

}
