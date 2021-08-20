import static org.junit.Assert.*;

import maven.CodeupCrypt;
import org.junit.Test;

public class CodeupCryptTest {

    @Test
    public void testVersion() {
        CodeupCrypt.version = 0.0;
        assertEquals(0.0, CodeupCrypt.version, 0);
    }

    @Test
    public void testHashPassword() {
        assertEquals("s4m", CodeupCrypt.hashPassword("sam"));

    }
}
