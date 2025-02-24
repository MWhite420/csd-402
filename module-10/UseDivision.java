/*
Mark White
CSD402
Assignment10 */

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision international1 = new InternationalDivision("Global Sales", "12345", "Canada", "English");
        InternationalDivision international2 = new InternationalDivision("European Operations", "67890", "Germany", "German");
        
        DomesticDivision domestic1 = new DomesticDivision("Northeast Sales", "54321", "New York");
        DomesticDivision domestic2 = new DomesticDivision("Southeast Sales", "09876", "Florida");

        //division details
        international1.display();
        international2.display();
        domestic1.display();
        domestic2.display();
    }
}