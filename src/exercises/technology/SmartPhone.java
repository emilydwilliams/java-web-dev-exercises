package exercises.technology;

public class SmartPhone extends Computer {
    private boolean goodCamera;

    public SmartPhone(double aRating, String aBrand, double aPrice, boolean aGoodCamera) {
        super(aRating, aBrand, aPrice);
        goodCamera = aGoodCamera;
    }

    public boolean isGoodCamera() {
        return goodCamera;
    }

    public void setGoodCamera(boolean goodCamera) {
        this.goodCamera = goodCamera;
    }

    public void takePicture() {
        if (goodCamera) {
            System.out.println("Beautiful picture taken! Cherish it forever.");
        } else {
            System.out.println("Kinda looks like this picture was taken with a potato.");
        }
    }
}
