package ESHOP;



public class Staff {
    private String mName;
    private String mPosition;
    private long mSalary;
    private int mAge;
    private int mExperienceMonth;
    private String mDepartment;

    public Staff(String name, String position, long salary, int age, int experienceMonth, String department) {
        mName = name;
        mPosition = position;
        mSalary = salary;
        mAge = age;
        mExperienceMonth = experienceMonth;
        mDepartment = department;
    }

    public double getSalary() {
        return mSalary / 100f;
    }

    public void chooseDepartment() {
        System.out.println("Есть три отдела:");
        System.out.println("Нажмите 1 для выбора 'Отдел бытовой техники'");
        System.out.println("Нажмите 2 для выбора 'Отдел компьютерной техники'");
        System.out.println("Нажмите 3 для выбора 'Отдел мобильных устройств'");

    }

    public void chooseBuyer (String enterDepartment) {
        switch (enterDepartment) {
            case "1":
                System.out.println("Это отдел бытовой техники. В наличии печь Greta. Хотите купить?");
                break;
            case "2":
                System.out.println("Это отдел компьютерной техники. В наличии PC Acer . Хотите купить?");
                break;
            case "3":
                System.out.println("Это отдел мобильных устройств. В наличии Iphone X. Хотите купить?");
                break;
            default:
                System.out.println("Вариант отсутствует");
        }




    }


}

