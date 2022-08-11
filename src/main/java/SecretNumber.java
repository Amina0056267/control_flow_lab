public class SecretNumber {

    public static void main(String[] args) {

        boolean greaterThan86 = false;
        boolean lessThan86 = false;

//        put secret number here
        int secretNumber = 86;

        System.out.println("Can you guess my secret number?");

//        Here we are collecting user input
        java.util.Scanner reader = new java.util.Scanner(System.in); // creating the scanner object


//        If the number is greater than 86, print 'False'
//        if the number is less than 86, print 'False'
//        if the number equals to 86, print 'Spot on you've got it right!'

        if (greaterThan86 || lessThan86) {
            System.out.println("Sorry try Again!");
        } else {
            System.out.println("Spot on you've got it right!");
        }












    }


}
