package br.com.ifood.entities;


public class Client extends Person {

    // Attributes
    private int id;

    // Construct
    public Client(String name, String cpf) {
        super(name, cpf);
    }

    // Methods
    public String toString() {
        return "Name: " + getName() + "\n" + "CPF: " + getCpf();
    }
}
