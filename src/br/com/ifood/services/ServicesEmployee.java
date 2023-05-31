package br.com.ifood.services;

import br.com.ifood.entities.Client;
import br.com.ifood.entities.Employee;

import java.util.Scanner;

public class ServicesEmployee {

    // Services Employee

    public void requestResignation(Employee employee) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Report what happened: ");
            String complaint = scan.nextLine();
            System.out.println("We are sorry for what happened.");

        } catch (Exception e) {
            System.out.println("non-existent employee");
        }
    }

    public boolean respondToComplaint(Client client) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Tell me what happened: ");
            String complaint = scan.nextLine();
            System.out.println("We apologize for what happened!");
        } catch (Exception e) {
            System.out.println("Invalid claim, try again!");
            return false;
        }
        return true;
    }
}