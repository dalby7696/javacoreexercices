package exo13.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import exo13.entity.Employee;
import exo13.entity.Experience;
import exo13.entity.Fresher;
import exo13.entity.Intern;

public class EmployeeManager
{

  private List<Employee> employees;

  public EmployeeManager()
  {
    this.employees = new ArrayList<>();
  }

  public void insert(Employee employee)
  {
    this.employees.add(employee);
  }


  public void update(Employee employee)
  {

  }

  public Employee findById(String id)
  {
    return this.employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
  }

  public boolean deleteById(String id)
  {
    Employee employee = this.findById(id);
    if (employee == null)
    {
      return false;
    }
    this.employees.remove(employee);
    return true;
  }

  /**
   * type = 0 => Experience type = 1 => Fresher type = 2 => Intern
   */

  public List<Employee> findByType(int type)
  {
    return this.employees.stream()
      .filter(employee -> {
        if (type == 0)
        {
          return employee instanceof Experience;
        }
        if (type == 1)
        {
          return employee instanceof Fresher;
        }
        if (type == 2)
        {
          return employee instanceof Intern;
        }
        return false;
      })
      .collect(Collectors.toList());
  }

  public List<Employee> findAll()
  {
    return this.employees;
  }

}
