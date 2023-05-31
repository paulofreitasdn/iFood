package br.com.ifood.repositories;

import br.com.ifood.entities.Client;

import java.util.List;

public interface IRepositoryClient {

    // Methods
    public boolean saveClient(Client client);

    public boolean deleteClient(Client client);

    public boolean updateClient(Client client);

    public List<Client> listClients();
}
