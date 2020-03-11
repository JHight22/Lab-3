
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jared
 */
public class PaintJobEstimator {

    public static void main(String[] args) {

        double gallonsOfPaintRequired;
        double hoursOfLaborRequired;
        double costOfPaint;
        double totalLaborCharges;
        double totalCostofJob;

        gallonsOfPaintRequired = getGallonsRequired();

        hoursOfLaborRequired = getHoursOfLabor(gallonsOfPaintRequired);

        costOfPaint = getCostOfPaint(gallonsOfPaintRequired);

        totalLaborCharges = getLaborCharges(hoursOfLaborRequired);

        totalCostofJob = calculateTotalCost(totalLaborCharges, costOfPaint);

        displayResultsToUser(totalLaborCharges, costOfPaint, totalCostofJob,
                gallonsOfPaintRequired, hoursOfLaborRequired);
    }

    public static double getGallonsRequired() {
        double squareFeet = 115;
        double numberOfRooms;
        double wallSpace;
        double gallonsOfPaintRequired;

        String numberOfRoomsToBePainted;

        numberOfRoomsToBePainted = JOptionPane.showInputDialog("Please enter the number of rooms that will be painted");
        numberOfRooms = Double.parseDouble(numberOfRoomsToBePainted);

        double totalSquareFeet = 0;
        String squareFeetForEachRoom;

        for (int i = 1; i <= numberOfRooms; i++) {
            squareFeetForEachRoom = JOptionPane.showInputDialog("Please enter the amount of square feet of wall space for room " + i);
            wallSpace = Double.parseDouble(squareFeetForEachRoom);
            totalSquareFeet += wallSpace;
        }
        gallonsOfPaintRequired = (totalSquareFeet / squareFeet);
        return gallonsOfPaintRequired;
    }

    public static double getCostOfPaint(double gallonsNeeded) {
        String pricePerGallonOfPaint;
        double paintPrice;
        pricePerGallonOfPaint = JOptionPane.showInputDialog("Enter price per gallon of paint");
        paintPrice = Double.parseDouble(pricePerGallonOfPaint);
        double costOfPaint = gallonsNeeded * paintPrice;

        return costOfPaint;
    }

    public static double getHoursOfLabor(double gallonsNeeded) {
        double hoursOfLabor = (gallonsNeeded * 8);
        return hoursOfLabor;
    }

    public static double getLaborCharges(double laborHours) {
        double totalChargesPerHourForLabor = ((laborHours * 18));
        return totalChargesPerHourForLabor;
    }

    public static double calculateTotalCost(double money, double spentOnPaint) {
        double totalCostOfJob = (money + spentOnPaint);
        return totalCostOfJob;
    }

    public static void displayResultsToUser(double totalLaborCharges, double costOfPaintRequired,
            double totalCostOfJob, double gallonsOfPaintRequired, double hoursOfLaborRequired) {

        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormat twoDecimalPlaces = new DecimalFormat("#0.00");

        JOptionPane.showMessageDialog(null, "Gallons needed: " + twoDecimalPlaces.format(gallonsOfPaintRequired) + "\n"
                + "Labor hours needed: " + twoDecimalPlaces.format(hoursOfLaborRequired) + "\n"
                + "Cost of paint: " + formatter.format(costOfPaintRequired) + "\n"
                + "Cost of labor: " + formatter.format(totalLaborCharges) + "\n"
                + "Total cost of job: " + formatter.format(totalCostOfJob);
    }
}
