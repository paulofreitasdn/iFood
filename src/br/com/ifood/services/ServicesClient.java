package br.com.ifood.services;

import java.util.Scanner;

import br.com.ifood.entities.Client;

public class ServicesClient {

    // Services of a Client

    // Methods
    public boolean rateRestaurant() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your review: ");
            int review = scan.nextInt();
            scan.nextLine();

        } catch (Exception e) {
            System.out.println("Error listing restaurants!");
            return false;
        }
        return true;
    }

    public boolean placeAnOrder(Client client) {

        Scanner scan = new Scanner(System.in);

        System.out.print("inform the restaurant: ");
        String restaurant = scan.nextLine();

        System.out.print("Inform the order: ");
        String order = scan.nextLine();

        System.out.print("Enter order amount: ");
        double value = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter the delivery address: ");
        String address = scan.nextLine();

        System.out.print("Enter payment method: ");
        String payment = scan.nextLine();

        System.out.println("\n" + "Request completed successfully!");
        System.out.println("Order will be delivered within 30 minutes..");
        return true;
    }

    public void cancelOrder(Client client) {
        System.out.println("Your order has been cancelled!");
    }
}