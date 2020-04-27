package String;
import java.util.Scanner;

public class fourtask{

    public static void main(String args[]){
        System.out.println("Введите любое предложение: ");
        Scanner lenth = new Scanner(System.in);
        String Str1 = lenth.nextLine();
        System.out.print("Длина строки - " );
        System.out.println(Str1.length());
    }
}