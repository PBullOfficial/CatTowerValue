public class Trapezoid extends Shape{
    double baseLength1;
    double baseLength2;

    public Trapezoid() {

    }

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

    double getArea() {
        area = .5 * height * (baseLength1 + baseLength2);
        return area;
    }
}
