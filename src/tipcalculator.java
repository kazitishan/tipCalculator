import java.util.Scanner;

public class tipcalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Asking the user for the information
        System.out.print("Total Bill: $");
        double bill = s.nextDouble();
        System.out.print("Tip %");
        double tip = s.nextDouble();
        System.out.print("Number of people: ");
        int people = s.nextInt();
        //converting the % to a decimal
        double tipDecimal = tip / 100;
        //calculating totalTip, totalBill, tipPerPerson, totalPerPerson
        double totalTip = (bill * tipDecimal);
        double totalBill = (bill + totalTip);
        double tipPerPerson = ((bill * tipDecimal) / people) + 0.005;
        double totalPerPerson = ((bill * (tipDecimal + 1)) / people) + 0.005;
        // printing the calculations
        System.out.printf("Total Tip: $%.2f %n", totalTip);
        System.out.printf("Total Bill: $%.2f %n", totalBill);
        System.out.printf("Tip per person: $%.2f %n", tipPerPerson);
        System.out.printf("Total per person: $%.2f %n", totalPerPerson);

    }
}
