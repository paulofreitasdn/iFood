package br.com.ifood.entities;


public class Client extends Person {

    // Attributes
    private int id;

    // Construct
    public Client(String name, String cpf, int id) {
        super(name, cpf);
        this.id = id;
    }

    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Methods
    public String toString() {
        return "Name: " + getName() + "\n" + "CPF: " + getCpf() + "\n" + "ID: " + getId();
    }
}
