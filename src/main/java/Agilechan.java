import java.util.Scanner;
import java.io.*;
import java.time.LocalDate;

public class Agilechan {
    private static final String ASCII_ART = 
        "  .._██_..  \n" +
        "  ‹(•¿•)›    \n" +
        "  ..(█) .. \n" +
        "  ../ I.    \n";
    
    private DailyTask dailyTask;
    private PrincipleReminder principleReminder;
    private Scanner scanner;

    public Agilechan() {
        this.dailyTask = new DailyTask();
        this.principleReminder = new PrincipleReminder();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println(ASCII_ART);
        System.out.println("Hello user, What can I help you with?\n");

        while (true) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    dailyTask.execute();
                    break;
                case 2:
                    principleReminder.showRandomPrinciple();
                    break;
                case 3:
                    System.out.println("Goodbye! See you tomorrow!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("\n1. Daily task");
        System.out.println("2. Remind me of a principle");
        System.out.println("3. Exit");
        System.out.print("$ ");
    }

    private int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        new Agilechan().start();
    }
}