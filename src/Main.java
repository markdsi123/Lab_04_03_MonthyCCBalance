public class Main {
    public static void main(String[] args) {
        double creditCardBalance = 5000.00;

        double interestDue1 = creditCardBalance * 1.17;
        double interestDue2 = interestDue1 * 1.17;

        System.out.println("Your interest due after one month is " + interestDue1 + "$");
        System.out.println("Your interest due after two months is: " + interestDue2 + "$");

    }



}