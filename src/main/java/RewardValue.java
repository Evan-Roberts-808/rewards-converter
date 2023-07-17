// RewardValue class is declared as public so it can be accessed from other classes
public class RewardValue { 

    // The private instance variable cashValue is of type double and is marked as final, meaning it cannot be changed once assigned.
    private final double cashValue;

    // The MILES_TO_CASH_CONVERSION_RATE is a constant variable (marked as final) that represents the conversion rate between miles and cash. 
    // It is declared as a static variable, meaning it belongs to the class itself rather than instances of the class.
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // This is a constructor that takes a cashValue parameter and assigns it to the cashValue instance variable.
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // This is another constructor that takes a milesValue parameter. 
    // It calls the convertToCash method to convert milesValue to a cash value, which is then assigned to the cashValue instance variable.
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    // These are two private static methods used for conversion between miles and cash values.
    // convertToMiles takes a cashValue as a parameter, performs the conversion using the MILES_TO_CASH_CONVERSION_RATE, and returns the result as an integer
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // convertToCash takes a milesValue as a parameter, multiplies it by the MILES_TO_CASH_CONVERSION_RATE, and returns the result as a double.
    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // getCashValue is a public method that returns the cashValue.
    public double getCashValue() {
        return cashValue
    }

    // getMilesValue is a public method that calls the convertToMiles method, passing the cashValue as a parameter, and returns the converted miles value.
    public int getMilesValue() {
        return convertToMiles(this.cashValue)
    }
}