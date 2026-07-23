import java.util.Scanner;
public class Marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        for(int i = 0; i<n; i++){
            System.out.println("\nStudent "+(i + 1));
            for(int j = 0; j < 3; j++){
                System.out.println("Marks for Subject "+(j + 1)+ ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        while (true) {
            System.out.println("\n Main Menu");
            System.out.println("1. Update Student Marks");
            System.out.println("2. Subject Average");
            System.out.println("3. Student Average");
            System.out.println("4. Student Total");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID (1-"+ n +"): ");
                    int id = sc.nextInt() - 1;

                    System.out.print("Enter Subject ID (1-3): ");
                    int sub = sc.nextInt() -1;

                    System.out.print("Enter New Marks: ");
                    marks[id][sub] = sc.nextInt();

                    System.out.println("Mark Updated Successfully.");
                    
                    break;

                    case 2:
                    System.out.print("Enter Subject ID (1-3): ");
                    sub = sc.nextInt() -1;
                    int subjectSum = 0;

                    for(int i = 0; i < n; i++) {
                        subjectSum += marks[i][sub];
                    }

                    double subjectAvg = (double)subjectSum /n;
                    
                    System.out.println("Subject Average = " +subjectAvg);

                    break;

                    case 3:
                    System.out.println("Enter Student ID (1-"+ n +"): ");
                    id = sc.nextInt() -1;
                    int studentSum = 0;

                    for(int j = 0; j < 3; j++){
                        studentSum += marks[id][j];
                    }

                    double studentAvg = (double)studentSum /3;
                    
                    System.out.println("Student Avergae = " + studentAvg);

                    break;

                    case 4:
                    System.out.print("Enter Student ID (1-" + n + "): ");
                    id = sc.nextInt() -1;

                    int total = 0;

                    for(int j = 0; j < 3; j++){
                        total += marks[id][j];
                    }

                    System.out.println("Student Total = "+ total);

                    break;

                    case 5:
                    System.out.println("Program Ended.");
                    sc.close();
                    return;
            
                default:
                    System.out.println("Invalid Choice!");
            }
            
        }

    }
}