package assignment1;

public class Main {
    public static void main(String[] args) {
        // Creating a person WITHOUT a dog
        Person p1 = new Person("Lakshay", 42);

        try {
            // Trying to change the dog's name (should throw an exception)
            p1.changeDogsName("Buby");
        } catch (RuntimeException e) {
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }

        // Creating a person WITH a dog
        Dog myDog = new Dog("Cha", 12);
        Person p2 = new Person("Vishwas", 24, myDog);

        // Checking if Vishwas has an old dog
        System.out.println(p2.getName() + " has an old dog: " + p2.hasOldDog());

        // Changing the dog's name
        p2.changeDogsName("Maxie");
        System.out.println("Dog's new name: " + p2.getDog().get().getName());
    }
}
