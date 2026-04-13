import java.util.Scanner;
public class RentalCarCalculator {
    public static void main(String[] args) {
        double basicCarRental = 29.99;
        double cost;
        double surcharges = 1;
        double underageDriverSurcharge = 0;
        double tolltagCost = 3.95;
        double gpsCost = 2.95;
        double roadSideAssitance = 3.95;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the pickup date?");
        String pickupDate = scanner.nextLine();

        System.out.println("How many days do you wanna rent it? ");
        int rentalDays = Integer.parseInt(scanner.nextLine());
        cost = basicCarRental * rentalDays;

        System.out.println("Do you want an electronic toll tag at $3.95/day? (yes/no)");
        String tollTag = scanner.nextLine();
        if (tollTag.equals("yes")) {
            surcharges = surcharges + (3.95 * rentalDays);
        }

        System.out.println("Do you want a GPS at 2.95/day? (yes/no)");
        String gps = scanner.nextLine();

        if (gps.equals("yes")) {
            surcharges = surcharges + (2.95 * rentalDays);
        }

        System.out.println("Do you want roadside assistance at $3.95/day? (yes/no)");
        String roadsideAssitance = scanner.nextLine();

        if (roadsideAssitance.equals("yes")) {
            surcharges = surcharges + (3.95 * rentalDays);
        }

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        if (age < 25) {
            underageDriverSurcharge = (30.0/100.0) * cost;
        }
        double totalCost = cost + surcharges + underageDriverSurcharge;
        System.out.printf("1. Basic car rental cost : $%.2f.\n2. Options cost : $%.2f.\n3. Underage Driver Surcharge : $%.2f.\n4. Total Cost : %.2f.",cost,surcharges,underageDriverSurcharge,totalCost);
        }


    }

