import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int numGal;
        int mpg;
        double gpg;
	    Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the number of gallons in your tank: ");
        numGal = userIn.nextInt();

        System.out.println("Now, enter the miles per gallon: ");
        mpg = userIn.nextInt();

        System.out.println("Finally, enter the price of gas per gallon: ");
        gpg = userIn.nextDouble();

        mpg = numGal;

        System.out.println("With gas price at $" + gpg + " per gallon, going 100 miles will cost $" + (gpg * 100));
        System.out.println("The car's efficiency is " + mpg + " mpg and since you have " +  numGal + " gallons in the tank, you can travel " + (int)(mpg * numGal) + " miles before you run out of gas.");
    }
}
