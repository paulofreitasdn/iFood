package br.com.ifood.repositories;

import br.com.ifood.entities.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositoryClient implements IRepositoryClient {
    List<Client> clientList = new ArrayList<>();

    @Override
    public boolean saveClient(Client client) {
        // Exception Handling
        try {
            clientList.add(client);
        } catch (Exception e) {
            System.out.println("Invalid Information!");
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteClient(Client client) {
        // Exception Handling
        try {
            clientList.remove(client);
        } catch (Exception e) {
            System.out.println("Could not remove!");
            return false;
        }
        return true;
    }

    @Override
    public boolean updateClient(Client client) {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Type your name: ");
            String name = scan.nextLine();

            System.out.println("Enter your CPF: ");
            String cpf = scan.nextLine();

            client.setName(name);
            client.setCpf(cpf);
        } catch (Exception e) {
            System.out.println("Invalid Information!");
            return false;
        }
        return true;
    }

    @Override
    public List<Client> listClients() {
        return clientList;
    }
}
