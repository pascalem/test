import core.Main;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest{

    @Test
    public void testAdd() {
        assertEquals(3, Main.add(1,2));
    }
}