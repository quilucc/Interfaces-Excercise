public class Main {
    public static void main(String[] args) {
        // Create an array of Persons
        Person[] persons = {
                new Person("John", "Doe"),
                new Person("Alice", "Smith"),
                new Person("Bob", "Johnson"),
                new Person("Charlie", "Smith"),
                new Person("Eve", "Brown")
        };

        // Print before sorting
        System.out.println("Before sorting:");
        for (Person p : persons) {
            p.print();
        }

        // Sort the array
        Sorter sorter = new Sorter();
        sorter.sort(persons);

        // Print after sorting
        System.out.println("\nAfter sorting:");
        for (Person p : persons) {
            p.print();
        }
    }
}
