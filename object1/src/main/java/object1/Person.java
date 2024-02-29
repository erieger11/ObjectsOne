package object1;

class Person {
    String name;
    int age = 0;
    int height = 0; //centimeters

    // Constructor
    public Person(String name, int age,int height) {
        this.name = name;
        this.age = age;
        this.height = 0;
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30,72);


    }
}
