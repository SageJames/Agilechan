import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrincipleReminderTest {
    private PrincipleReminder principleReminder;
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        principleReminder = new PrincipleReminder();
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testShowRandomPrincipleOutputsNonEmptyString() {
        principleReminder.showRandomPrinciple();
        String output = outputStream.toString();
        assertFalse("Output should not be empty", output.trim().isEmpty());
    }

    @Test
    public void testShowRandomPrincipleContainsHeader() {
        principleReminder.showRandomPrinciple();
        String output = outputStream.toString();
        assertTrue("Output should contain header", output.contains("Reminder of the day:"));
    }

    @Test
    public void testMultipleCallsReturnValidPrinciples() {
        for (int i = 0; i < 10; i++) {
            outputStream.reset();
            principleReminder.showRandomPrinciple();
            String output = outputStream.toString();
            assertTrue("Output should contain a valid principle", 
                output.contains("Reminder of the day:") && 
                output.trim().split("\n").length == 2);
        }
    }

    @org.junit.After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}