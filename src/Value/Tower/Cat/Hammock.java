package Value.Tower.Cat;

// A hammock has the same calculation as an inverted semi-sphere
public class Hammock extends Shape {
    protected String name = "Hammock";
    double radius;

    public Hammock() {
    }

    public Hammock(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        area = 2 * pi * pi;
        return area;
    }

    public void setRadius(double theRadius) {
        radius = theRadius;
    }
    
    // Getter getName() inherited and overwritten from Shape
    @Override
    public String getName() {
        return this.name;
    }
}
