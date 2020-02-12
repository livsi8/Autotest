package Module_01.HW3;
    import java.util.Scanner;
    class task6 {

        public static void main(String[] args) {
            Scanner scan1 = new Scanner(System.in);

            System.out.println("Введите число");
            int number1 = scan1.nextInt();
            int number2;
            scan1.close();
            if (number1 % 3 == 0){
                System.out.println("Число " + number1 + " кратное трём");
            }
            else {
                number2 = number1 % 3;
                System.out.println("Остаток: " + number2);
            }

        }
}
