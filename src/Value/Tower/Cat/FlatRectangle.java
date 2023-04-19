package Value.Tower.Cat;
// Child class for Flat Rectangles
// Controls flat rectangle calculation
// Rectangular platforms

public class FlatRectangle extends Shape{
    protected String name = "FlatRectangle";

    // Default constructor
    public FlatRectangle() {
    }

    // Constructor with parameters
    public FlatRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Usable area for rectangular platforms
    @Override
    double getArea() {
        area = (length * width) / 2;
        return area;
    }

    // Getter getName() inherited and overwritten from Shape
    @Override
    public String getName() {
        return this.name;
    }
}
