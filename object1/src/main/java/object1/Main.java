package object1;

import java.sql.SQLOutput;
import java.util.logging.Logger;

public class Main {
    public static void main(String... args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("Bill", 82, 84);
        Person person2 = new Person("Bob",20,90);

        System.out.println(person1.height);

        Person[] people = new Person[2];

        people[0] = person1;
        people[1] = person2;


        System.out.println(people[0].name);
        Car car1 = new Car("Ford","F150",2018,5000,"Black");
        Car car2 = new Car("Ford", "F150",2020,1000,"Red");
        Car car3 = new Car("Ford","F150",2021,500,"Silver");
        Car car4 = new Car("Ford","F150",2022,1000,"Green");

        Car[] cars = new Car[4];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;

        

        System.out.println(cars[0].getYear());
    }

}
