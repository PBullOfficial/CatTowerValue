package Value.Tower.Cat;
public class FlatEllipse extends Shape{
    protected String name = "Flat Ellipse";


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

    // Setter and Getter functions
    @Override
    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    @Override
    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    @Override
    public void getMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    @Override
    public void getMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }
}
