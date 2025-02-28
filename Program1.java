package myPackage;
class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Unknown";
        this.age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects
        Person person1 = new Person();
        Person person2 = new Person("Alice", 25);
        person1.display();
        person2.display();
    }
}
