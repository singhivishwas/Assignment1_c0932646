package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogTest {
    @Test
    public void testDogAttributes() {
        Dog dog = new Dog("Kavy", 5);
        assertEquals("Kavy", dog.getName());
        assertEquals(5, dog.getAge());
    }

    @Test
    public void testSetDogAttributes() {
        Dog dog = new Dog("Maxie", 12);
        dog.setName("Roco");
        dog.setAge(8);
        assertEquals("Roco", dog.getName());
        assertEquals(8, dog.getAge());
    }
}