package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
            if (name == null) {
                throw new IllegalArgumentException("Name cannot be null");
            } else if (name.isEmpty() || name.length() > 40) {
                throw new IllegalArgumentException("Name cannot be empty, nor can it have more than 40 characters");
            } else if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Age cannot be negative or 0, nor can it be higher than 120");
            } else {
                this.name = name;
                this.age = age;
            }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
