package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testPersonWithoutDog() {
        Person person = new Person("Ali", 55);
        assertTrue(person.getDog().isEmpty()); // Person should not have a dog
        assertFalse(person.hasOldDog()); // Should return false
    }

    @Test
    public void testPersonWithYoungDog() {
        Dog dog = new Dog("Bucky", 5);
        Person person = new Person("Bobby", 30, dog);
        assertNotNull(person.getDog());
        assertFalse(person.hasOldDog()); // Dog is not old
    }

    @Test
    public void testPersonWithOldDog() {
        Dog dog = new Dog("Chares", 12);
        Person person = new Person("Kapoor", 40, dog);
        assertTrue(person.hasOldDog()); // Dog is old
    }

    @Test
    public void testChangeDogsName() {
        Dog dog = new Dog("Lucy", 4);
        Person person = new Person("Davinder", 35, dog);
        person.changeDogsName("Cat");
        assertEquals("Cat", person.getDog().get().getName());
    }

    @Test
    public void testChangeDogsNameWithoutDog() {
        Person person = new Person("Lexi", 28);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            person.changeDogsName("Luna");
        });
        assertEquals("Lexi does not own a dog!", exception.getMessage());
    }
}