package git_142;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testPersonAttributes() {
        Person person = new Person();
        person.setName("John");
        person.setAge(35);

        assertEquals("John", person.getName());
        assertEquals(35, person.getAge());
    }
}
