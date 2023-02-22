import java.io.*;

public class CalculateTax {
    public static void main(String[] args) throws IOException {
        double taxRate = 0;
        double firstPrice, secondPrice, thirdPrice;
        double taxPayable, totalPrice;
        String input;

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the tax rate: ");
        input = stdin.readLine();
        taxRate = Double.parseDouble(input);

        System.out.println("Enter the first price: ");
        input = stdin.readLine();
        firstPrice = Double.parseDouble(input);

        System.out.println("Enter the second price: ");
        input = stdin.readLine();
        secondPrice = Double.parseDouble(input);

        System.out.println("Enter the third price: ");
        input = stdin.readLine();
        thirdPrice = Double.parseDouble(input);

        totalPrice = firstPrice + secondPrice + thirdPrice;
        taxPayable = taxRate * totalPrice;

        System.out.println("The total price is " + totalPrice);
        System.out.println("The tax payable is " + taxPayable);
    }
}
