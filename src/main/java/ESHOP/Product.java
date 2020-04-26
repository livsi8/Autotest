package ESHOP;

public class Product {
    private String mProductName;
    private double mPrice;
    private boolean mAvailable;
    private String mCharacteristic;
    private String mDepartment;
    private int mCount;

    public Product(String name, double price, boolean available, String characteristic, String department, int count) {
        mProductName = name;
        mPrice = price;
        mAvailable = available;
        mCharacteristic = characteristic;
        mDepartment = department;
        mCount = count;

    }
    public void Product (String enterProduct) {
        switch (enterProduct) {
            case "1":
                System.out.println("Iphone X, price 22000.Подходит?");
                break;
            case "2":
                System.out.println("Acer,price 50000. Подходит?");
                break;
            case "3":
                System.out.println("Greta, price 10000. Подходит?");
                break;
            default:
                System.out.println("Такого варианта нет");
        }
    }

}
