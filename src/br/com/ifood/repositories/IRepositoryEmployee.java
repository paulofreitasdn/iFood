package br.com.ifood.repositories;

import br.com.ifood.entities.Employee;

import java.util.List;

public interface IRepositoryEmployee {

    // Methods
    public boolean saveEmployee(Employee employee);

    public boolean deleteEmployee(Employee employee);

    public boolean updateEmployee(Employee employee);

    public List<Employee> listEmployees();
}