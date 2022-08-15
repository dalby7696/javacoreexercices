package exo13.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import exo13.entity.Certificate;
import exo13.entity.Employee;
import exo13.entity.Experience;
import exo13.entity.Fresher;
import exo13.entity.Intern;
import exo13.exception.BirthDayException;
import exo13.exception.EmailException;
import exo13.exception.FullNameException;
import exo13.exception.PhoneException;
import exo13.service.EmployeeManager;
import exo13.service.ValidatorService;

public class UIManager
{

  private EmployeeManager employeeManager = new EmployeeManager();

  /**
   * @param type
   * @return Employee type = 0 => Experience type = 1 => Fresher type = 2 => Intern
   */
  public void insert(int type)
  {
    Employee employee = null;

      if (type == 0)
      {
        System.out.println("Create a new Employee of type experience ");
        employee = insertExperience();
      }
      if (type == 1)
      {
        System.out.println("Create a new Employee of type Fresher ");
        employee = insertFresher();
      }
      if (type == 2)
      {
        System.out.println("Create a new Employee of type Intern ");
      }
    try
    {
      checkData(employee);
    }/*catch (BirthDayException e)
    {
      System.out.println(e.getMessage());
      // insert  => insert(type);
      insert(type);
    }*/
    catch (PhoneException e)
    {
      System.out.println(e.getMessage());
      // insert  => insert(type);
      insert(type);
    }
    catch (EmailException e)
    {
      System.out.println(e.getMessage());
      // insert  => insert(type);
      insert(type);
    }
    catch (FullNameException e)
    {
      System.out.println(e.getMessage());
      // insert  => insert(type);
      insert(type);
    }
    System.out.println("Result "+employee);
    this.employeeManager.insert(employee);

  }

  public Experience insertExperience()
  {
    var scanner = new Scanner(System.in);
    Scanner scanner_ = new Scanner(System.in);
    Map<String, String> map = employeeInput();
    System.out.print("Input professional skill: ");
    String proSkill = scanner.nextLine();
    System.out.print("Input year of experiences: ");
    int yearOfExperience = scanner_.nextInt();
    System.out.print("Input date of birth: ");
    LocalDate birthday = dateInput(scanner.next());

    List<Certificate> certificates = addCertificates();
     Employee exp=  new Experience(map.get("ID"), map.get("Name"), birthday, map.get("phone"), map.get("email"), certificates,
      yearOfExperience, proSkill);
    return (Experience)exp;
  }

  public Intern insertIntern()
  {
    Map<String, String> map = employeeInput();
    Scanner scanner = new Scanner(System.in);
    var scanner_ = new Scanner(System.in);
    System.out.print("Input date of birth: ");
    LocalDate birthday = dateInput(scanner.next());
    ;

    System.out.print("Input the major: ");
    String major = scanner.nextLine();
    System.out.print("Input the semester: ");
    int semester = scanner_.nextInt();
    System.out.print("Input university Name: ");
    String universityName = scanner.nextLine();
    List<Certificate> certificates = addCertificates();

      Intern intern= new Intern(map.get("ID"), map.get("Name"), birthday, map.get("phone"), map.get("email"), certificates, major,
      semester, universityName);
    return intern;
  }

  public Fresher insertFresher()
  {
    Map<String, String> map = employeeInput();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input date of birth: ");
    LocalDate birthday = dateInput(scanner.next());
    System.out.print("Input graduation date: ");
    LocalDate graduationDate = dateInput(scanner.next());
    System.out.print("Input graduation rank: ");
    String graduationRank = scanner.nextLine();
    ;
    System.out.print("Input university name: ");
    String universityName = scanner.nextLine();
    ;
    List<Certificate> certificates = addCertificates();

     Fresher fresher= new Fresher(map.get("ID"), map.get("Name"), birthday, map.get("phone"), map.get("email"), certificates,
      graduationDate, graduationRank, universityName);
    return fresher;
  }

  public void update()
  {
    System.out.print("Input ID to update: ");
    String id = new Scanner(System.in).nextLine();
    Employee employee = this.employeeManager.findById(id);
    if (employee == null)
    {
      System.out.println("Unable to find Employee with " + id);
    }
    else
    {
      if (employee instanceof Fresher)
      {
        insertFresher();
      }
      if (employee instanceof Experience)
      {
        insertExperience();
      }
      if (employee instanceof Intern)
      {
        insertIntern();
      }
    }

  }

  public void delete()
  {
    System.out.print("Input ID to delete: ");
    String id = ScannerFactory.getScanner().nextLine();
    boolean b = this.employeeManager.deleteById(id);
    if (b)
    {
      System.out.println("Employee with " + id + " deleted successfully");
    }
    else
    {
      System.out.println("Failed to deleted employee with id :" + id);
    }
  }

  public void showAllEmployee()
  {
    this.employeeManager.findAll().forEach(Employee::showInformation);
  }

  private void checkData(Employee employee) throws /*BirthDayException,*/ PhoneException, EmailException, FullNameException
  {
   // ValidatorService.birthdayCheck(employee.getBirthday());
    ValidatorService.phoneCheck(employee.getPhone());
    ValidatorService.emailCheck(employee.getEmail());
    ValidatorService.nameCheck(employee.getFullName());
  }

  public List<Employee> findByType(int type)
  {
    return employeeManager.findByType(type);
  }

  private List<Certificate> addCertificates()
  {
    List<Certificate> certificates = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter certificate information");
    System.out.print("Input certificate ID: ");
    String certificateId = scanner.nextLine();
    System.out.print("Input certificate name: ");
    String certificateName = scanner.nextLine();
    System.out.print("Input certificate rank: ");
    String rank = scanner.nextLine();
    System.out.print("Input certificate date: ");
    LocalDate certificateDate = dateInput(scanner.next());

    certificates.add(new Certificate(certificateId, certificateName, rank, certificateDate));
    return certificates;
  }

  public static LocalDate dateInput(String userInput)
  {
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate date = LocalDate.parse(userInput, dateFormat);
    return date;
  }

  private static Map<String, String> employeeInput()
  {
    Scanner scanner = new Scanner(System.in);
    Map<String, String> map = new HashMap<>();
    System.out.print("Input ID: ");
    map.put("ID", scanner.nextLine());
    System.out.print("Input full Name: ");
    map.put("Name", scanner.nextLine());
    System.out.print("Input Phone: ");
    map.put("phone", scanner.nextLine());
    System.out.print("Input Email: ");
    map.put("email", scanner.nextLine());
    return map;
  }
}
