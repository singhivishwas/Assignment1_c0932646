package assignment1;

import java.util.Objects;

public class Dog {
    private String name;
    private Integer age;

    // Constructor
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods (to access private variables)
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // Setter methods (to modify private variables)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(age, dog.age);
    }

}