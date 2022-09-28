// Rectangle class definition
public class Rectangle {

    // instance variables
    private int length;
    private int width;

    // constructor method for creating Rectangle objects;
    // instance variables are set here using the values passed as arguments
    public Rectangle(int len, int wid) {
        length = len;
        width = wid;
    }

    // method that calculates and returns area
    public int calculateArea() {
        return length * width;
    }

    // method that calculates and prints area
    public int printArea() {
        int area = calculateArea();
        return area;
//        System.out.println("My area is " + area);
    }

    // method that calculates and returns volume
    // of a box with length, width, and height
    public double calculateBoxVolume(double height) {
        return calculateArea() * height;
    }

    // method that calculates and prints volume
    // of a box with length, width, and height
    public double printBoxVolume(double height) {
        double volume = calculateArea() * height;
        return volume;
//        System.out.println("The volume is: " + volume);
    }
}
