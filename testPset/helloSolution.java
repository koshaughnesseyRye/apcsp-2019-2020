import java.util.Scanner;
public class Greetings2
{
  public static void main(String[ ] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String firstName = in.nextLine( );
    System.out.print("Enter your last name: ");
    String lastName = in.nextLine( );
    System.out.println("Hello, " + firstName + " " + lastName);
    in.close();
  }
}
