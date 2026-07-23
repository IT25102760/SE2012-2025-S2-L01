import java.util.Scanner;
public class Welcome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String Fname = scanner.nextLine();

        System.out.println("Enter your Last Name: ");
        String Lname = scanner.nextLine();

        System.out.println("Weclome to Second Year: "+Fname+" "+Lname);
    }
}