package Value.Tower.Cat;

// A hammock has the same calculation as an inverted semi-sphere
public class Hammock extends Shape {
    protected String name = "Hammock";

    public Hammock() {
    }

    public Hammock(double radius) {
        this.radius = radius;
    }

    // Usable area for hammocks
    @Override
    double getArea() {
        area = 2 * pi * pi;
        return area;
    }

    // Setter and Getter functions
    @Override
    public void setRadius(double theRadius) {
        this.radius = theRadius;
    }

    @Override
    public double getRadius() {
        return this.radius;
    }
    
    // Getter getName() inherited and overwritten from Shape
    @Override
    public String getName() {
        return this.name;
    }
}
