package university;

public class Person {
    private String name;
    private Integer age;

    public Person() {

    }

    public Person(String n) {
        name = n;
    }

    public Person(String n, Integer a) {
        name = n;
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public String getNameAndAge() {
        return name + age;
    }

    public void setAge(Integer a) {
        age = a;
    }

    public Integer getAge() {
        return age;
    }

    public void save() {

    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
