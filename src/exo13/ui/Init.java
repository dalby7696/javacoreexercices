package exo13.ui;

import java.util.Scanner;

public class Init
{
  public static void init()
  {
    UIManager uiManager = new UIManager();
    Scanner scanner = new Scanner(System.in);
    Scanner scanner_ = new Scanner(System.in);
    while (true)
    {
      System.out.println("Application manager");
      System.out.println("Enter 1: To insert ");
      System.out.println("Enter 2: To search: ");
      System.out.println("Enter 3: To delete: ");
      System.out.println("Enter 4: To update ");
      System.out.println("Enter 5: : To exit:");
      Integer l1 = scanner.nextInt();
      switch (l1)
      {
        case 1:
        {
          System.out.println("Enter 0: to insert Experience");
          System.out.println("Enter 1: to insert Fresher");
          System.out.println("Enter 2: to insert Intern");

          int type = scanner.nextInt();
          uiManager.insert(type);
          break;
        }
        case 2:
        {
          System.out.println("Enter type to find:");
          System.out.println("Enter 0: to search Experience");
          System.out.println("Enter 1: to search Fresher");
          System.out.println("Enter 2: to search Intern");
          int type = scanner.nextInt();
          ;
          System.out.println("Results " + uiManager.findByType(type));
          break;
        }
        case 3:
          uiManager.delete();
          break;
        case 4:
          uiManager.update();
          break;
        case 5:
        {
          System.exit(0);
          System.out.flush();
        }
        default:
        {
          System.out.println("Invalid");
          continue;
        }
      }
    }

  }
}
