package Value.Tower.Cat;

class Utils {
    static boolean isInteger(String str) {
        return str.matches("^-?\\d+$");
    }

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
            System.out.printf("Total area: %.2f%n", (totalArea));
            System.out.println("Price: $" + price);
            System.out.printf("Price per square inch is: $%.2f%n", (doublePrice / totalArea));
        } else if (price instanceof Integer) {
            int intPrice = price.intValue();
            System.out.println("\n**Results**");
            System.out.println("Total area: " + totalArea);
            System.out.println("Price: $" + price);
            System.out.printf("Price per square inch is: $%.2f%n", (intPrice / totalArea));
        }
        
    }

}
