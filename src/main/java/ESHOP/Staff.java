package ESHOP;

import org.omg.PortableServer.POA;

public class Staff {
    private String mName;
    private String mPosition;
    private long mSalary;
    private int mAge;
    private int  mExperienceMonth;
    private String mDepartment;

    public  Staff(String name, String position, long salary, int age, int experienceMonth, String department) {
        mName = name;
        mPosition = position;
        mSalary = salary;
        mAge = age;
        mExperienceMonth = experienceMonth;
        mDepartment = department;
    }
    public double getSalary () {
        return mSalary / 100f;
    }
}
