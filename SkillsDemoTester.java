import static org.junit.Assert.*;
import org.junit.*;

public class SkillsDemoTester {
    @Test
    public void multiply() {
        assertEquals(3, SkillsDemo.multiply(2,3)); //fails initially
    }
}
