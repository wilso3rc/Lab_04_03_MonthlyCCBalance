// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int creditCardBalance = 5000;
        double INTEREST_RATE = 0.17;
        double finalValue = 0;

        finalValue = creditCardBalance * INTEREST_RATE;
        System.out.println("The interest due after one month is $" + finalValue);

        finalValue = (finalValue + creditCardBalance)* INTEREST_RATE + finalValue ;
        System.out.println("The interest due after two months is $" + finalValue);
    }
}