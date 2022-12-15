import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ui {
    LoopMetoder loopMetoder = new LoopMetoder();
    Person person = new Person();
    Person person1 = new Person("Harry", "Potter", 100);
    Person person2 = new Person("Ron", "Weasley", 231);
    Person person3 = new Person("Hermione", "Granger", 420);
    Person person4 = new Person("Ginny", "Weasley", 1000);
    Person person5 = new Person("Draco", "Malfoy", 215);
    Person person6 = new Person("Neville", "Longbottom", 7);
    Person personer [] = {person4, person2, person3, person1};
    ArrayList<Person> personArrayList = new ArrayList<>();
    public void start(){
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        personArrayList.add(person1);
        personArrayList.add(person2);
        System.out.println(loopMetoder.calculateTotalPoints(personer));
        System.out.println(loopMetoder.findMinimum(personer));
        System.out.println(loopMetoder.findMaximum(personer));
        arrays();
    }

    public void arrays(){
        String personNavne [] = {person1.getFirstName(), person2.getFirstName(), person3.getFirstName()};
        System.out.println("--------------------------------------");
        System.out.println(Arrays.toString(personer));
        System.out.println("--------------------------------------");
        System.out.println(Arrays.toString(personNavne));
        System.out.println("--------------------------------------");
        for (Person personere : personer){
            System.out.println(personere);
        }
    }

    public void loop(){

    }
}


