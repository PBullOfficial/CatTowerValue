package Value.Tower.Cat;

class Utils {
    // Returns true if string is in integer format
    static boolean isInteger(String str) {
        return str.matches("^-?\\d+$");
    }
    // Returns true if string is in double format
    static boolean isDouble(String str) {
        return str.matches("^-?\\d+\\.\\d+$");
    }

    // Display area for final results
    static void displayArea(double totalArea) {
        System.out.printf("Total area of the cat tower is: %.2f%n", totalArea);
    }

    // Display area for ongoing totalArea summation
    static void displayAreaCont(double totalArea) {
        System.out.printf("The total area so far is: %.2f%n", totalArea);
    }

    // Results page for generic price type, ie int or double
    static <T extends Number> void displayResults(double totalArea, T price) {
        if (price instanceof Double) {
            double doublePrice = price.doubleValue();
            System.out.println("\n**Results**");
            System.out.printf("Total area: %.2f%n", totalArea);
            System.out.printf("Price: $ %.2f%n", price);
            System.out.printf("Price per square inch is: $%.2f%n", (doublePrice / totalArea));
        } else if (price instanceof Integer) {
            int intPrice = price.intValue();
            System.out.println("\n**Results**");
            System.out.printf("Total area: %.2f%n", totalArea);
            System.out.println("Price: $" + price);
            System.out.printf("Price per square inch is: $%.2f%n", (intPrice / totalArea));
        }
        
    }

    // Main menu
    public static void printMainMenu() {
        System.out.println("Menu Options:");
        System.out.println("(1) New cat tower");
        System.out.println("(2) View previous cat tower");
        System.out.println("(3) Quit");
    }

    // Shape menu
    public static void printShapeMenu() {
        System.out.println("Shape Options: ");
        System.out.println("(1) Cuboid");
        System.out.println("(2) Cylinder");
        System.out.println("(3) Flat Rectangle");
        System.out.println("(4) Flat Ellipse");
        System.out.println("(5) Hammock");
        System.out.println("(6) Trapezoid");
        System.out.println("(7) Compute!");
        System.out.println("(8) Exit");
    }

    public static void printAnotherShapeMenu() {
        System.out.println("Another shape?");
        System.out.println("(1) Yes");
        System.out.println("(2) No - Compute!");
    }

}
