package Module_01.Lesson_01;

public class DataTypeAndOperation {

    public static void main(String[] args) {

        //объявление и инициализация переменных
        //byte - диапазон допустимых значений от -128 до 127
        //short — диапазон допустимых значений от -32768 до 32767
        //int — диапазон допустимых значений от -2147483648 до 2147483647
        //long — диапазон допустимых значений от -9223372036854775808 до 9223372036854775807
        //float — диапазон допустимых значений от 1,4*10^-45 до ~3,4*10^38
        //double — диапазон допустимых значений от ~4,9*10^-324  до ~1,8*10^308
        //char — символьный тип данных представляет собой один 16-битный Unicode символ
        //boolean — предназначен для хранения логических значений (true или false).

        byte num = 5;
        byte num_ = 2;

        short num1 = 52;
        short num1_ = 10;

        int num2 = 33;
        int num2_ = 15;

        long num3 = 4332234L;
        long num3_ = 423L;

        float num4 = 66.55F;
        float num4_ = 20.2F;

        double num5 = 8.999;
        double num5_ = 2.33;


        char num6 = 664;
        char num6_ = 255;

        boolean error = false;
        boolean successful = true;

        //произвести (включая %) арифметическии операции между однотипами (int -> int, byte -> byte, ...)
        byte module = (byte) (num % num_);
        short module1 = (short) (num1 % num1_);
        int module2 = num2 % num2_;
        long module3 = num3 % num3_;
        float module4 = num4 % num4_;
        double module5 = num5 % num5_;

        byte sum = (byte) (num + num_);
        short sub = (short) (num1_ - num1);
        int mul = num2 * num2_;
        long div = num3 / num3_;
        float sum1 = num4 + num4_;
        double sum2 = num5 + num5_;

        //произвести (включая %) арифметическии операции между разными типами (long -> int, byte -> int, ...)
        double div1 = div % module;
        float sum3 = module3 + div;

    }
}

