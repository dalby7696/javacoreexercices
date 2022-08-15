package exo13.service;

import java.util.List;

import exo13.entity.Employee;

public interface EmployeeService
{
  void insert(Employee employee);
  void update(Employee employee);
  Employee findById(String id);
  boolean deleteById(String id);
  List<Employee> findAll();
  public List<Employee> findByType(int type);

}
