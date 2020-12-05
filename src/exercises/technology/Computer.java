package exercises.technology;

public class Computer {
    private double rating;
    private String brand;
    private double price;

    public Computer(double aRating, String aBrand, double aPrice) {
        rating = aRating;
        brand = aBrand;
        price = aPrice;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double amountOff) {
        price -= amountOff;
    }

    public void addTax(double taxRate) {
        price += (price * taxRate);
    }

}
