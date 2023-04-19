package Value.Tower.Cat;
// Child class for Cylinders
// Controls cylinder area calculation
// Post
public class Cylinder extends Shape{
    protected String name = "name";
    double radius;

    // Default constructor
    public Cylinder() {
    }

    // Constructor with parameters
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
    @Override
    double getArea() {
        area = (2 * pi * radius * (height + radius)) - (3 * pi * radius * radius);
        return area;
    }

    // Getter getName() inherited and overwritten from Shape
    @Override
    public String getName() {
        return this.name;
    }

    // Setter functions
    public void setRadius(double theRadius) {
        radius = theRadius;
    }

    public void setHeight(double theHeight) {
        this.height = theHeight;
    }
}
