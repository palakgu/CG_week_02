public class Person {
    // Attributes
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create Person objects
        Person originalPerson = new Person("John Doe", 30); // Using parameterized constructor
        Person clonedPerson = new Person(originalPerson);   // Using copy constructor

        // Display person details
        originalPerson.displayPersonDetails();
        clonedPerson.displayPersonDetails();
    }
}
