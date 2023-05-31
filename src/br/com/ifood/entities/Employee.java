package br.com.ifood.entities;

public class Employee extends Person {

    // Attributes
    private double salary;
    private String typeOfEmployee;

    public Employee(String name, String cpf) {
        super(name, cpf);
    }

    // Getter & Setter

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTypeOfEmployee() {
        return typeOfEmployee;
    }

    public void setTypeOfEmployee(String typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }

    // Methods
    public String toString() {
        return "Name: " + getName() + "\n" + "CPF: " + getCpf();
    }
}