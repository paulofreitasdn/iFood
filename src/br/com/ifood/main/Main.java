package br.com.ifood.main;

import br.com.ifood.entities.Client;
import br.com.ifood.entities.Employee;
import br.com.ifood.repositories.RepositoryClient;
import br.com.ifood.repositories.RepositoryEmployee;
import br.com.ifood.services.ServicesClient;
import br.com.ifood.services.ServicesEmployee;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RepositoryEmployee repositoryemployee = new RepositoryEmployee();
        RepositoryClient repositoryclient = new RepositoryClient();

        ServicesClient servicesClient = new ServicesClient();
        ServicesEmployee servicesEmployee = new ServicesEmployee();

        // Employees

        Employee employee1 = new Employee("Paulo Freitas", "000-111");
        Employee employee2 = new Employee("Robson", "102030-00");
        Employee employee3 = new Employee("Gustavo", "9908-33");

        // Clients

        Client client1 = new Client("Felipe", "668-543", 1299);
        Client client2 = new Client("Marcos", "7843-000", 2254);
        Client client3 = new Client("Rodrigo", "4321-876", 7652);

        // Creating employees and saving to the repository

        repositoryemployee.saveEmployee(employee1);
        repositoryemployee.saveEmployee(employee2);
        repositoryemployee.saveEmployee(employee3);

        // Creating clients and saving to the repository

        repositoryclient.saveClient(client1);
        repositoryclient.saveClient(client2);
        repositoryclient.saveClient(client3);

        // Removing clients
        repositoryclient.deleteClient(client1);
        repositoryclient.deleteClient(client2);

        // Removing Employees
        repositoryemployee.deleteEmployee(employee1);
        repositoryemployee.deleteEmployee(employee2);

        // Listing customers and employees

        List<Employee> employees = repositoryemployee.listEmployees();

        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
        }

        List<Client> clients = repositoryclient.listClients();

        System.out.println("\n" + "Clients:");
        for (Client client : clients) {
            System.out.println("Name: " + client.getName());
        }

        Scanner scan = new Scanner(System.in);

        int number = 0;

        while (number != 6) {

            System.out.println("\n" + "Enter [1] to place an order");
            System.out.println("Enter [2] to cancel an order");
            System.out.println("Enter [3] to view your account information");
            System.out.println("Enter [4] to rate a restaurant");
            System.out.println("Enter [5] to rate a restaurant");
            System.out.println("Enter [6] to exit");
            number = scan.nextInt();

            if (number == 1) {
                servicesClient.placeAnOrder(client3);
            } else if (number == 2) {
                servicesClient.cancelOrder(client3);
            } else if (number == 3) {
                System.out.println("-----------");
                System.out.println(client3);
                System.out.println("-----------");
            } else if (number == 4) {
                servicesClient.rateRestaurant();
            } else if (number == 5) {
                System.out.println(servicesEmployee.respondToComplaint(client3));
            } else if (number != 6) {
                System.out.println("Invalid Option!");
            }
        }
    }
}