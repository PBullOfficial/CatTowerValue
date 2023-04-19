package Value.Tower.Cat;
public class FlatEllipse extends Shape{
    protected String name = "FlatEllipse";
    double majorAxis;
    double minorAxis;

    public FlatEllipse() {
    }

    public FlatEllipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    // Usable area for elliptical platforms
    @Override
    double getArea() {
        area = majorAxis * minorAxis * pi;
        return area;
    }

    // Getter getName() inherited and overwritten from Shape
    @Override
    public String getName() {
        return this.name;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }
}
