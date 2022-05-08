// This program calculates the usable surface area for cat towers
// and gives surface area/$
// Calculate surface area for each shape - ****Need individual functions****
// Shapes subclasses are cuboid, cylinder, rectangle, ellipse, inverted semi-sphere
// User options are hut, post, platform (rectangular or elliptical), hammock

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Try using arrayList to manage data storage in shape objects -> calculate total area from this

        Menu();



    }

    // Handles menu
    public static void Menu() {
        int choice, choice2, choice3, choice4, choice5, choice6;
        Scanner scan = new Scanner(System.in);
        boolean ext = true, ext2 = true, ext3 = true;
        do {
            // Main menu
            System.out.println("Menu Options:");
            System.out.println("(1) New cat tower");
            System.out.println("(2) View previous cat tower");
            System.out.println("(3) Quit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    // Shape submenu
                    Scanner scan2 = new Scanner(System.in);
                    do {
                        System.out.println("Shape Options: ");
                        System.out.println("(1) Cuboid");
                        System.out.println("(2) Cylinder");
                        //System.out.println("(3) Flat Rectangle");
                        //System.out.println("(4) Flat Ellipse");
                        //System.out.println("(5) Hammock");
                        System.out.println("(6) Compute!");
                        //System.out.println("(7) Previous Menu");
                        System.out.println("(8) Exit");
                        choice2 = scan2.nextInt();
                        switch (choice2) {
                            case 1:
                                // Cuboid submenu
                                Cuboid cube = new Cuboid();
                                System.out.println("Enter length: ");
                                cube.setLength(scan2.nextDouble());
                                System.out.println("Enter width: ");
                                cube.setWidth(scan2.nextDouble());
                                System.out.println("Enter height: ");
                                cube.setHeight(scan2.nextDouble());
                                System.out.println("The area of this cuboid is: " + cube.getCuboidArea());
                                Scanner scan3 = new Scanner(System.in);
                                do {
                                    System.out.println("Another shape?");
                                    System.out.println("(1) Yes");
                                    System.out.println("(2) No - Compute!");
                                    choice3 = scan3.nextInt();
                                    switch (choice3) {
                                        case 1:
                                            // Returns to previous menu
                                            choice3 = 1;
                                            ext3 = false;
                                            break;
                                        case 2:
                                            //Send to results screen
                                            System.out.println("Total area of the cat tower is: ");
                                            choice3 = 1;
                                            ext3 = false;
                                            ext2 = false;
                                            break;
                                        default:
                                            System.out.println("Invalid Selection");
                                    }
                                } while (choice3 != 1 && ext3);
                                break;
                            case 2:
                                // Cylinder submenu
                                Cylinder cyl = new Cylinder();
                                System.out.println("Enter height: ");
                                cyl.setHeight(scan2.nextDouble());
                                System.out.println("Enter radius: ");
                                cyl.setRadius(scan2.nextDouble());
                                System.out.println("The surface area provided by this cylinder is: " + cyl.getCylinderArea());
                                System.out.println("**Note -- Cylinders take away surface area where they are placed,");
                                System.out.println("therefore, the total contributed area may be negative.");
                                scan3 = new Scanner(System.in);
                                do {
                                    ext3 = true;
                                    System.out.println("Another shape?");
                                    System.out.println("(1) Yes");
                                    System.out.println("(2) No - Compute!");
                                    choice3 = scan3.nextInt();
                                    switch (choice3) {
                                        case 1:
                                            // Returns to previous menu
                                            choice3 = 1;
                                            ext3 = false;
                                            break;
                                        case 2:
                                            //Send to results screen
                                            System.out.println("Total area of the cat tower is: ");
                                            choice3 = 1;
                                            ext3 = false;
                                            ext2 = false;
                                            break;
                                        default:
                                            System.out.println("Invalid Selection");
                                    }
                                } while (choice3 != 1 && ext3);
                                break;
                            case 3:
                                // Make new
                                // ...
                                // etc.
                                break;
                            case 4:
                                // Make new
                                // ...
                                // etc.
                                break;
                            case 5:
                                // Make new
                                // ...
                                // etc.
                                break;
                            case 6:
                                // Make new
                                // ...
                                // etc.
                                break;
                            case 7:
                                // Make new
                                // ...
                                // etc.
                                break;
                            case 8:
                                System.exit(0);
                                ext2 = false;
                                break;
                            default:
                                System.out.println("Invalid Selection");
                                break;
                        }

                    } while (choice2 != 7 && ext2);
            }
        } while (choice != 3 && ext);
    }
}



