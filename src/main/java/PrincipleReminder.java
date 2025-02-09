import java.util.Random;

public class PrincipleReminder {
    private static final String[] PRINCIPLES = {
        "Individuals and interactions over processes and tools",
        "Working software over comprehensive documentation",
        "Customer collaboration over contract negotiation",
        "Responding to change over following a plan",
        "Our highest priority is to satisfy the customer through early and continuous delivery of valuable software",
        "Welcome changing requirements, even late in development",
        "Deliver working software frequently",
        "Business people and developers must work together daily",
        "Build projects around motivated individuals",
        "Face-to-face conversation is the best form of communication",
        "Working software is the primary measure of progress",
        "Agile processes promote sustainable development",
        "Continuous attention to technical excellence enhances agility",
        "Simplicity--the art of maximizing the amount of work not done--is essential",
        "The best architectures, requirements, and designs emerge from self-organizing teams",
        "Teams regularly reflect on how to become more effective"
    };

    private Random random;

    public PrincipleReminder() {
        this.random = new Random();
    }

    public void showRandomPrinciple() {
        int index = random.nextInt(PRINCIPLES.length);
        System.out.println("\nReminder of the day:");
        System.out.println(PRINCIPLES[index]);
    }
}