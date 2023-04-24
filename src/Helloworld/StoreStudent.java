package Helloworld;

import java.util.Scanner;
public class StoreStudent {

    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        int inputInt, quantity;
        byte inputByte;

        //Change between these
        byte totalQuantity = 0;
        byte price = 0;
        //Change between these

        System.out.println("Welcome to the store!");
        do {
            System.out.println("Please enter 0 to leave and finish purchasing items.");
            System.out.println("Please enter 1 for item 1, which costs $10");
            System.out.println("Please enter 2 for item 2, which costs $20");
            System.out.print("Enter your choice: ");
            inputByte = in.nextByte();
            switch(inputByte) {
                case 1:
                case 2:
                    System.out.print("How many items would you like to buy?: ");
                    quantity = in.nextInt();
                    totalQuantity += quantity;
                    if (inputByte == 1)
                        price += quantity * 10;
                    else
                        price += quantity * 20;
                    System.out.println("You now have : " + totalQuantity + " total items in your cart");
                    System.out.println("Your total is : $" + price);
                    System.out.println();
                    break;

                case 0:
                default:
                    System.out.println("Thanks for visiting us.");
                    System.exit(0);
            }
        }while (true);
    }
}
