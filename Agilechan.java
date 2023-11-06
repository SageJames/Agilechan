import java.util.Scanner;

public class Agilechan {

    private Scanner scanner;

    public Agilechan() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        String userInput;
        do {
            printWelcomeMessage();
            userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    handleDailyTaskUpdate();
                    break;
                case "2":
                    remindAgilePrinciple();
                    break;
                case "3":
                    System.out.println("Exiting Agilechan... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
            }
        } while (!userInput.equals("3"));
    }

    private void printWelcomeMessage() {
        System.out.println("  .._██_..");
        System.out.println("  ‹(•¿•)›");
        System.out.println("  ..(█) .. Hello user, What can I help you with?");
        System.out.println("  ../ I.");
        System.out.println();
        System.out.println("1. Daily task update");
        System.out.println("2. Remind me of a principle");
        System.out.println("3. Exit");
        System.out.print("$ █ ");
    }

    private void handleDailyTaskUpdate() {
        System.out.println("What did you accomplish yesterday?");
        String yesterday = scanner.nextLine();
        
        System.out.println("What's on your agenda today?");
        String today = scanner.nextLine();
        
        System.out.println("Any blockers?");
        String blockers = scanner.nextLine();
        
        System.out.println("Yesterday: " + yesterday);
        System.out.println("Today: " + today);
        System.out.println("Blockers: " + blockers);
    }

    private void remindAgilePrinciple() {
        System.out.println("Remember, \"Working software is the primary measure of progress.\" Keep creating value. Keep it agile!");
    }

    public static void main(String[] args) {
        Agilechan agilechan = new Agilechan();
        agilechan.start();
    }
}

