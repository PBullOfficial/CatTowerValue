// Child class for Cylinders
// Controls cylinder area calculation
// Post
public class Cylinder extends Shape{
    double radius;
    double area;
    // Default constructor
    public Cylinder() {

    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter method for Cylinder area
    /* Top and bottom of cylinder are assumed unusable.
        Bottom needs to be subtracted TWICE (total 3) as unusable because
        it makes the top of the other piece (in the shape
        of the bottom of the cylinder) unusable.
        Reduces demand on user input. */
    public double getArea() {
        area = (2 * pi * radius * (height + radius)) - (3 * pi * radius * radius);
        return area;
    }

    // Setter function for radius
    public void setRadius(double theRadius) {
        radius = theRadius;
    }

    public void setHeight(double theHeight) {
        this.height = theHeight;
    }



}
