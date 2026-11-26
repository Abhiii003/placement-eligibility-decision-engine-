
import java.util.Scanner;

public class Main{
    public static void main(String [] args) {
       Scanner scanner =  new Scanner(System.in);

       String name = scanner.next();
       double percentage = scanner.nextDouble();
       int backlogs =  scanner.nextInt();
       int graduationYear = scanner.nextInt();

       System.err.println("Candidate: " + name);
       System.err.println("Percentage: " + percentage);
       System.err.println("Backlogs: " + backlogs);
       System.err.println("Graduation Year: " + graduationYear);

       scanner.close();
    }
}
    
    
