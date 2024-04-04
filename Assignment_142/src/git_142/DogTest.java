package git_142;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DogTest {

    @Test
    public void testDogAttributes() {
        Dog dog = new Dog("Buddy", "Labrador");
        dog.setName("Charlie");
        dog.setBreed("German Shepherd");

        assertEquals("Charlie", dog.getName());
        assertEquals("German Shepherd", dog.getBreed());
    }
}
