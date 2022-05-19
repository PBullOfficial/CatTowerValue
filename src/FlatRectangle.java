// Child class for Flat Rectangles
// Controls flat rectangle calculation
// Rectangular platforms


public class FlatRectangle extends Shape{
    public FlatRectangle() {
    }

    public FlatRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Usable area for rectangular platforms
    double getArea() {
        area = (length * width) / 2;
        return area;
    }



}
