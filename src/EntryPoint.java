import logic.Calculator;
import logic.Car;
import university.Faculty;
import university.Person;
import university.Student;
import university.Teacher;

import java.util.Objects;

public class EntryPoint {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Elmir");
        person1.setAge(18);
        person1.print();

        Person person2 = new Person();
        person2.setName("Dilefruz");
        person2.setAge(23);
        person2.print();

        Person person3 = new Person("Teymur");
        person3.setAge(23);
        person3.print();

        Person person4 = new Person("Kenan", 27);
        person4.print();


        Faculty f1 = new Faculty();
        f1.name = "TR";

        Student s1 = new Student();
        s1.setName("Senan");
        s1.setAge(23);
        s1.faculty = f1;
        s1.group = "54";
        s1.save();

        Teacher t1 = new Teacher();
        t1.faculty = f1;

        // Car logic

//        Car car1 = new Car();
        Car car1 = Car.create();
        car1.setManufacturer("Mercedes");
        car1.setModel("E200");
        car1.setYear(2001);
        car1.print();

//        Car car2 = new Car();
        Car car2 = Car.create();
        car2.setManufacturer("Mercedes");
        car2.setModel("S600");
        car2.setYear(2006);
        car2.print();

        // Put your code here


        System.out.println("Created car instances: " + Car.getCount());

//        for (String arg : args) {
//            System.out.println(arg);
//        }
//        if (args.length == 3) {
//            String aString = args[0];
//            String operation = args[1];
//            String bString = args[2];
//
//            int a = Integer.parseInt(aString);
//            int b = Integer.parseInt(bString);
//
//            if (Objects.equals(operation, "+")) {
//                System.out.println(a + b);
//            } else if (Objects.equals(operation, "-")) {
//                System.out.println(a - b);
//            } else if (Objects.equals(operation, "/")) {
//                System.out.println(a / b);
//            } else if (Objects.equals(operation, "v")) {
//                System.out.println(a * b);
//            } else {
//                System.out.println("Duzgun emelliyat daxil edilmeyib!");
//            }
//
//        } else {
//            System.out.println("3 arg olmalidir");
//        }

//        if (args.length > 0) {
//            String command = args[0];
//
//            if (Objects.equals(command, "-h")) {
//                System.out.println("-h - for help");
//                System.out.println("-n - for name");
//            } else if (Objects.equals(command, "-n")) {
//                System.out.println("Adinizi daxil edin:");
//                String name = System.console().readLine();
//                System.out.println("Salam " + name + "!");
//            } else {
//                System.out.println("Duzgun command daxil edilmeyib!");
//            }
//
//        } else {
//            System.out.println("En azi 1 arg daxil et!");
//        }

    }

}
