/*
Mark White
CSD402
Assignment10 */

public class InternationalDivision extends Division {
    private String country;
    private String languageSpoken;

    public InternationalDivision(String divisionName, String accountNumber, String country, String languageSpoken) {
        super(divisionName, accountNumber);
        this.country = country;
        this.languageSpoken = languageSpoken;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + getDivisionName() + ", Account Number: " + getAccountNumber() +
                ", Country: " + country + ", Language: " + languageSpoken);
    }
}
