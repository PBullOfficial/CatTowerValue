package Value.Tower.Cat;
// Parent class for Shape objects
// Controls length, width, and height for all shape objects

abstract class Shape {
    protected String name = "Shape";
    protected double length;
    protected double width;
    protected double height;
    protected double area;
    protected double radius;
    protected double majorAxis;
    protected double minorAxis;
    static protected double pi = Math.PI;

    // Default Constructor
    public Shape() {
    }

    // Setter and Getter functions
    public String getName() {
        return name;
    }

    void setLength(double theLength) {
        this.length = theLength;
    }

    double getLength() {
        return this.length;
    }

    void setWidth(double theWidth) {
        this.width = theWidth;
    }

    double getWidth() {
        return this.width;
    }

    void setHeight(double theHeight) {
        this.height = theHeight;
    }

    double getHeight() {
        return this.height;
    }

    void setRadius(double theRadius) {
        this.radius = theRadius;
    }

    double getRadius() {
        return this.radius;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    public void getMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public void getMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    protected void cutOutHoles(String shape) {
        switch (shape) {
            case "circle":
                // cutOutCircle();
                break;
            case "arch":
                // cutOutArch();
                break;
            case "rectangle":
                // cutOutRectangle();
                break;
            default:
        }
    }

    double getArea() {
        return area;
    }

/*  // To be used for Main simplification later
    void shapeMenu() {

    } */

    // Generic method to display totalArea for any shape
    <T> void displayArea() {
        System.out.printf("The total area of this " + getName() + " is: %.2f%n", getArea());
    }

}

