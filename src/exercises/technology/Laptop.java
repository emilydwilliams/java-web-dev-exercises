package exercises.technology;

public class Laptop extends Computer {
    private String size;

    public Laptop(double aRating, String aBrand, double aPrice, String aSize) {
        super(aRating, aBrand, aPrice);
        size = aSize;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String isRecommended() {
        if (super.getRating() > 3.5 && super.getPrice() < 1000 && super.getBrand() == "Apple") {
            return "Highly recommend!";
        } else if (super.getRating() < 2) {
            return "Definitely not!";
        } else {
            return "Maybe";
        }
    }
}
