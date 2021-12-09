import java.util.Scanner;

public class TrackerConsole {
    public static void main(String args[]) {
        int i = 0;
        Scanner scanInput = new Scanner(System.in);
        LifestyleTracker app = new LifestyleTracker();

        do {
            System.out.println("Enter a command");
            String userInput = scanInput.next();
            if (userInput.contains("food")) {
                System.out.println("Add new food?");
                String getFood = scanInput.next();
                System.out.println("How many calories");
                double getCalories = scanInput.nextDouble();
                System.out.println(app.addFood("pasta", 2000)); 
            }
            else if (userInput.contains("eat")) {
                System.out.println(app.eat("pasta", 20));
            }
            else if (userInput.contains("report")) {
                System.out.println(app.report());
            }
            i++;
        } while (i < 10);
    }
}
