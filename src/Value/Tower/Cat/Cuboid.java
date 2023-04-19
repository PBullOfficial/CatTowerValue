package Value.Tower.Cat;
// Child class for Cuboids
// Controls box area calculation
// Hut
public class Cuboid extends Shape{
    protected String name = "Cuboid";
    
    // Default constructor
    public Cuboid() {
    }

    // Constructor with parameters
    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Getter function for boxArea
    // Still needs cut out holes function
    // Note - the interior floor of the cube makes up for the bottom not being used
    @Override
    double getArea() {
        area = 2 * ((length * width) + (length * height) + (width * height));
        return area;
    }

    // Getter getName() inherited and overwritten from Shape
    @Override
    public String getName() {
        return this.name;
    }
}
