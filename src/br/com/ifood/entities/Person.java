package br.com.ifood.entities;

public abstract class Person {

    // Attributes
    private String name;
    private String cpf;
    private int age;
    private String sex;

    // Construct
    public Person() {

    }

    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}