public class Ui {
    Person person = new Person();
    public void start(){
        Person person1 = new Person("Harry", "Potter", 100);
        Person person2 = new Person("Ron", "Weasley", 231);
        Person person3 = new Person("Hermione", "Granger", 420);
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
    }
}
