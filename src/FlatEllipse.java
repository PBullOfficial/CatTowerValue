public class FlatEllipse extends Shape{
    double majorAxis;
    double minorAxis;

    public FlatEllipse() {
    }

    public FlatEllipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    // Usable area for elliptical platforms
    double getArea() {
        area = majorAxis * minorAxis * pi;
        return area;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }
}
