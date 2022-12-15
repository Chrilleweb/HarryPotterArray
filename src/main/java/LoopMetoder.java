import java.util.ArrayList;

public class LoopMetoder {
    Person person = new Person();
    private ArrayList<Person> persons = new ArrayList<>();

    public LoopMetoder() {

    }

    public int calculateTotalPoints(Person[] persons) {
        int total = 0;
        for (Person personere : persons){
            total += personere.getPoints();
        }
        return total;
    }

    public int minimumPerson(){
        int minimumPerson = 0;
        for (Person person1 : persons){
            minimumPerson = person1.getPoints();
        }
        return minimumPerson;
    }

    public Person findMinimum(Person[] persons){
        Person findMinimum = null;
        for (Person personsre : persons){
           if (personsre.getPoints() > minimumPerson()){
               findMinimum = personsre;
           }
        }
        return findMinimum;
    }

    public Person findMaximum(Person[] people) {
        Person maximumPerson = people[0];
        for (Person person : people) {
            if (person.getPoints() > maximumPerson.getPoints()) {
                maximumPerson = person;
            }
        }
        return maximumPerson;
    }

}
