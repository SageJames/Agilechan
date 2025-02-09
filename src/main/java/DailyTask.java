import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class DailyTask {
    private static final String TASKS_FILE = "daily_tasks.txt";
    private Scanner scanner;

    public DailyTask() {
        this.scanner = new Scanner(System.in);
    }

    public void execute() {
        showLastEntry();
        recordToday();
    }

    private void showLastEntry() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TASKS_FILE))) {
            String line;
            String lastEntry = "";
            while ((line = reader.readLine()) != null) {
                lastEntry = line;
            }
            if (!lastEntry.isEmpty()) {
                System.out.println("\nLast time you worked on:");
                System.out.println(lastEntry);
            }
        } catch (IOException e) {
            System.out.println("No previous entries found.");
        }
    }

    private void recordToday() {
        System.out.println("\nWhat did you work on today?");
        String today = scanner.nextLine();
        
        System.out.println("What are you planning to do next?");
        String plan = scanner.nextLine();
        
        System.out.println("Any obstacles in your way?");
        String obstacles = scanner.nextLine();

        try (PrintWriter writer = new PrintWriter(new FileWriter(TASKS_FILE, true))) {
            writer.println(LocalDate.now() + " | Today: " + today + " | Plan: " + plan + " | Obstacles: " + obstacles);
        } catch (IOException e) {
            System.out.println("Error saving your entry.");
        }
    }
}