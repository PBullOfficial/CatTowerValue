package Value.Tower.Cat;
// This program calculates the usable surface area for cat towers

// and gives surface area/$
// Shapes subclasses are cuboid, cylinder, flat rectangle, flat ellipse, semi-sphere

/* Proposed Changes -
 * - Refactor with more concise menu (String array w/ options)
 * - Unit conversion for different units of measurement
 * - Error handling
 * - Testing
 * - GUI
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double price = 0;
        double totalArea = 0; // Global variable to hold total area computed
        // String input line for $ amount, so "$" is right before the input
        String input;
        int choice, choice2, choice3;
        Scanner scan = new Scanner(System.in);

        // Welcome message
        System.out.print("\n*** Welcome to CatTowerValue! ***\n" +
                "This program takes the price and dimensions of a cat tower\n" +
                "and computes its value per square inch.\n\n");

        System.out.print("Let's begin. How much did it cost? $");
        
        // Loop to check if price input string is a number
        boolean tryAgain = true;
        while(tryAgain) {
            // Acquiring price variable value
            input = scan.next();
            // If price is a double string, parse it to an double
            // If price is an integer string, parse it to an integer and then cast to a double
            if (Utils.isDouble(input)) {
                price = Double.parseDouble(input);
                tryAgain = false;
            } else if (Utils.isInteger(input)) {
                price = (double) Integer.parseInt(input);
                tryAgain = false;
            } else {
                System.out.println("Try again. Enter a number.");
            }
        }
        // Welcome message 2
        System.out.print("\nWOW! This cat tower costs $");
        System.out.printf("%.2f!", price);
        System.out.println("\n...");
        System.out.println("Now, onto the menu.\n");

        // Start of menu loop and main functionality
        do {
            // Main menu
            Utils.printMainMenu();
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    // New cat tower
                    // Reset totalArea to 0
                    totalArea = 0;
                    // Shape submenu
                    Scanner scan2 = new Scanner(System.in);
                    do {
                        Utils.printShapeMenu();
                        choice2 = scan2.nextInt();
                        switch (choice2) {
                            case 1:
                                // Cuboid submenu
                                Cuboid cube = new Cuboid();
                                // Prompt for user input of dimensions (dims)
                                System.out.println("Enter length: ");
                                cube.setLength(scan2.nextDouble());
                                System.out.println("Enter width: ");
                                cube.setWidth(scan2.nextDouble());
                                System.out.println("Enter height: ");
                                cube.setHeight(scan2.nextDouble());
                                // Calculate and display Cuboid instance area based on input dims
                                cube.displayArea();
                                // Add instance area to totalArea
                                totalArea += cube.getArea();
                                // Display totalArea to this point
                                Utils.displayAreaCont(totalArea);
                                Scanner scan3 = new Scanner(System.in);
                                do {
                                    Utils.printAnotherShapeMenu();
                                    choice3 = scan3.nextInt();
                                    switch (choice3) {
                                        case 1:
                                            // Returns to previous menu
                                            break;
                                        case 2:
                                            // Send to results screen
                                            Utils.displayResults(totalArea, price);
                                            choice3 = 1;
                                            choice2 = 7;
                                            break;
                                        default:
                                            System.out.println("Invalid Selection");
                                    }
                                } while (choice3 != 1);
                                break;
                            case 2:
                                // Cylinder submenu
                                Cylinder cyl = new Cylinder();
                                System.out.println("Enter height: ");
                                cyl.setHeight(scan2.nextDouble());
                                System.out.println("Enter radius: ");
                                cyl.setRadius(scan2.nextDouble());
                                cyl.displayArea();
                                System.out.println("**Note -- Cylinders can take away useable area from the surface on which they are standing.");
                                System.out.println("As a result, the total useable area may be negative.");
                                totalArea += cyl.getArea();
                                // Display totalArea to this point
                                Utils.displayAreaCont(totalArea);
                                scan3 = new Scanner(System.in);
                                do {
                                    Utils.printAnotherShapeMenu();
                                    choice3 = scan3.nextInt();
                                    switch (choice3) {
                                        case 1:
                                            // Returns to previous menu
                                            break;
                                        case 2:
                                            // Send to results screen
                                            Utils.displayResults(totalArea, price);
                                            choice3 = 1;
                                            choice2 = 7;
                                            break;
                                        default:
                                            System.out.println("Invalid Selection");
                                    }
                                } while (choice3 != 1);
                                break;
                            case 3:
                                // Flat Rectangle submenu
                                FlatRectangle flat = new FlatRectangle();
                                System.out.println("Enter length: ");
                                flat.setLength(scan2.nextDouble());
                                System.out.println("Enter width: ");
                                flat.setWidth(scan2.nextDouble());
                                System.out.println("The usable surface area provided by this flat rectangle is: "
                                        + flat.getArea());
                                totalArea += flat.getArea();
                                // Display totalArea to this point
                                Utils.displayAreaCont(totalArea);
                                scan3 = new Scanner(System.in);
                                do {
                                    Utils.printAnotherShapeMenu();
                                    choice3 = scan3.nextInt();
                                    switch (choice3) {
                                        case 1:
                                            // Returns to previous menu
                                            break;
                                        case 2:
                                            // Send to results screen
                                            Utils.displayResults(totalArea, price);
                                            choice3 = 1;
                                            choice2 = 7;
                                            break;
                                        default:
                                            System.out.println("Invalid Selection");
                                    }
                                } while (choice3 != 1);
                                break;
                            case 4:
                                // Flat Ellipse submenu
                                FlatEllipse flatE = new FlatEllipse();
                                System.out.println("Enter major axis: ");
                                flatE.setMajorAxis(scan2.nextDouble());
                                System.out.println("Enter minor axis: ");
                                flatE.setMinorAxis(scan2.nextDouble());
                                flatE.displayArea();
                                totalArea += flatE.getArea();
                                // Display totalArea to this point
                                Utils.displayAreaCont(totalArea);
                                scan3 = new Scanner(System.in);
                                do {
                                    Utils.printAnotherShapeMenu();
                                    choice3 = scan3.nextInt();
                                    switch (choice3) {
                                        case 1:
                                            // Returns to previous menu
                                            break;
                                        case 2:
                                            // Send to results screen
                                            Utils.displayResults(totalArea, price);
                                            choice3 = 1;
                                            choice2 = 7;
                                            break;
                                        default:
                                            System.out.println("Invalid Selection");
                                    }
                                } while (choice3 != 1);
                                break;
                            case 5:
                                // Hammock submenu
                                Hammock ham = new Hammock();
                                System.out.println("Enter radius: ");
                                ham.setRadius(scan2.nextDouble());
                                ham.displayArea();
                                totalArea += ham.getArea();
                                // Display totalArea to this point
                                Utils.displayAreaCont(totalArea);
                                scan3 = new Scanner(System.in);
                                do {
                                    Utils.printAnotherShapeMenu();
                                    choice3 = scan3.nextInt();
                                    switch (choice3) {
                                        case 1:
                                            // Returns to previous menu
                                            break;
                                        case 2:
                                            // Send to results screen
                                            Utils.displayResults(totalArea, price);
                                            choice3 = 1;
                                            choice2 = 7;
                                            break;
                                        default:
                                            System.out.println("Invalid Selection");
                                    }
                                } while (choice3 != 1);
                                break;
                            case 6:
                                Trapezoid trap = new Trapezoid();
                                System.out.println("Enter height: ");
                                trap.setHeight(scan2.nextDouble());
                                System.out.println("Enter base length 1: ");
                                trap.setBaseLength1(scan2.nextDouble());
                                System.out.println("Enter base length 2: ");
                                trap.setBaseLength2(scan2.nextDouble());
                                System.out.println("The surface area provided by this trapezoid is: " + trap.getArea());
                                totalArea += trap.getArea();
                                // Display totalArea to this point
                                Utils.displayAreaCont(totalArea);
                                scan3 = new Scanner(System.in);
                                do {
                                    Utils.printAnotherShapeMenu();
                                    choice3 = scan3.nextInt();
                                    switch (choice3) {
                                        case 1:
                                            // Returns to previous menu
                                            break;
                                        case 2:
                                            // Send to results screen
                                            Utils.displayResults(totalArea, price);
                                            choice3 = 1;
                                            choice2 = 7;
                                            break;
                                        default:
                                            System.out.println("Invalid Selection");
                                    }
                                } while (choice3 != 1);
                                break;
                            case 7:
                                // Results page from shape menu
                                Utils.displayResults(totalArea, price);
                                break;
                            case 8:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid Selection");
                                break;
                        }

                    } while (choice2 != 7);
            }
        } while (choice != 3);
        scan.close();
    }
}
