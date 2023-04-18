package Value.Tower.Cat;
// Parent class for Shape objects
// Controls length, width, and height for all shape objects

abstract class Shape {
    protected double length;
    protected double width;
    protected double height;
    protected double area;
    static protected double pi = Math.PI;

    // Setter and Getter functions
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

    //Will be used for Main simplification later
    void shapeMenu() {

    }


}

