import com.sun.jdi.VMOutOfMemoryException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {

    @Test
    public void companyNameEquals() {
        String company = "Codeup";
        assertNotEquals(company, "CodeUp");
    }

    @Test
    public void arrayListsAreNotSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void arraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }


}
