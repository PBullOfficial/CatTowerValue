// Child class for Cuboids
// Controls box area calculation
// Hut
public class Cuboid extends Shape{
    double cuboidArea;
    // Default constructor
    public Cuboid() {
    }

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Getter function for boxArea
    // Still needs subtraction function/equation for unusable surface area

    double getCuboidArea() {
        return 2 * ((length * width) + (length * height) + (width * height));
    }

    // This method could be a solution to simplify the menu and help with final area calculation.
    /*Cuboid enterCuboidDims(double length, double width, double height) {

        Cuboid cube = new Cuboid();
        this.length = length;
        this.width = width;
        this.height = height;
        return this;
    } */
}
