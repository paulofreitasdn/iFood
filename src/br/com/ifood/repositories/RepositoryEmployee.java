package br.com.ifood.repositories;

import br.com.ifood.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositoryEmployee implements IRepositoryEmployee {
    List<Employee> peopleList = new ArrayList<>();

    @Override
    public boolean saveEmployee(Employee employee) {
        // Exception Handling
        try {
            peopleList.add(employee);
        } catch (Exception e) {
            System.out.println("Invalid Information!");
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteEmployee(Employee employee) {
        // Exception Handling
        try {
            peopleList.remove(employee);
        } catch (Exception e) {
            System.out.println("Could not remove!");
            return false;
        }
        return true;
    }

    @Override
    public boolean updateEmployee(Employee employee) {

        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Type your name: ");
            String name = scan.nextLine();

            System.out.println("Enter your CPF: ");
            String cpf = scan.nextLine();

            employee.setName(name);
            employee.setCpf(cpf);
        } catch (Exception e) {
            System.out.println("Invalid Information!");
            return false;
        }
        return true;
    }

    @Override
    public List<Employee> listEmployees() {
        return peopleList;
    }
}