package Value.Tower.Cat;
public class Trapezoid extends Shape{
    protected String name = "Trapezoid";
    double baseLength1;
    double baseLength2;


    // Default constructor
    public Trapezoid() {
    }

    // Constructor with parameters
    public Trapezoid (double baseLength1, double baseLength2) {
        this.baseLength1 = baseLength1;
        this.baseLength2 = baseLength2;
    }

    public void setBaseLength1(double baseLength1) {
        this.baseLength1 = baseLength1;
    }

    public void setBaseLength2(double baseLength2) {
        this.baseLength2 = baseLength2;
    }

    @Override
    double getArea() {
        area = .5 * height * (baseLength1 + baseLength2);
        return area;
    }
    // Getter getName() inherited and overwritten from Shape
    @Override
    public String getName() {
        return this.name;
    }
}
