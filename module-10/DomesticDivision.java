/*
Mark White
CSD402
Assignment10 */

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + getDivisionName() + ", Account Number: " + getAccountNumber() +
                ", State: " + state);
    }
}