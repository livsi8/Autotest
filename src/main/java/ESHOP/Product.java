package ESHOP;

public class Product {
    private String mProductName;
    private double mPrice;
    private boolean mAvailable;
    private String mCharacteristic;
    private String mDepartment;

    public Product(String name, double price, boolean available, String characteristic, String department ) {
        mProductName = name;
        mPrice = price;
        mAvailable = available;
        mCharacteristic = characteristic;
        mDepartment = department;
    }

}
