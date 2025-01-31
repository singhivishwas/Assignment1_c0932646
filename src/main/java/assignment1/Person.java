package assignment1;

import java.util.Optional;

public class Person {
    private String name;
    private Integer age;
    private Optional<Dog> dog; // A person may or may not own a dog

    // Constructor without a dog
    public Person(String name, Integer age) {
        this(name, age, null); // Calls the second constructor with 'null'
    }

    // Constructor with a dog
    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog); // Uses Optional to avoid null issues
    }

    // Method to check if the person has an old dog (age >= 10)
    public boolean hasOldDog() {
        return dog.isPresent() && dog.get().getAge() >= 10;
    }

    // Method to change the dog's name or throw an exception if no dog exists
    public void changeDogsName(String newName) {
        if (dog.isEmpty()) {
            throw new RuntimeException(this.name + " does not own a dog!");
        }
        dog.get().setName(newName);
    }

    // Overriding equals() to compare Person objects properly
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name) && age.equals(person.age) &&
                ((dog.isEmpty() && person.dog.isEmpty()) || (dog.isPresent() && dog.equals(person.dog)));
    }
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Optional<Dog> getDog() {
        return dog;
    }
}