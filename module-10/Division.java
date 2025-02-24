/*
Mark White
CSD402
Assignment10 */

public abstract class Division {
    private String divisionName;
    private String accountNumber;

    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Getters to access private fields
    public String getDivisionName() {
        return divisionName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Abstract method to be implemented in subclasses
    public abstract void display();
}