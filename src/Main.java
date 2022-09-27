import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Main {
    @Test
    public void basicTests() {
        assertEquals(5, Kata.lostSheep(new int[] {1,2}, new int[] {3,4}, 15));
        assertEquals(6, Kata.lostSheep(new int[] {3,1,2}, new int[] {4,5}, 21));
    }
}