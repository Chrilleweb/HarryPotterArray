import java.lang.reflect.Array;
import java.util.ArrayList;

public class LoopMetoder {
    Person person = new Person();
    private ArrayList<Person> persons = new ArrayList<>();

    public LoopMetoder() {

    }

    public int calculateTotalPoints(ArrayList<Person> persons) {
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

    public Person findMinimum(ArrayList<Person> persons){
        Person findMinimum = persons.get(0);
        for (Person personsre : persons){
           if (personsre.getPoints() < findMinimum.getPoints()){
               findMinimum = personsre;
           }
        }
        return findMinimum;
    }

    public Person findMaximum(ArrayList<Person> persons) {
        Person maximumPerson = persons.get(0);
        for (Person person : persons) {
            if (person.getPoints() > maximumPerson.getPoints()) {
                maximumPerson = person;
            }
        }
        return maximumPerson;
    }

    public double calculateAverage(ArrayList<Person> persons) {
        int totalPoints = 0;
        int numPeople = persons.size();
        for (Person person : persons) {
            totalPoints += person.getPoints();
        }
        return totalPoints / (double) numPeople;
    }

    public Person findByFirstName(ArrayList<Person> personer, String name){
        Person searchResult = personer.get(0);
        for (Person person1 : personer){
            if (person1.getFirstName().equals(name)){
               searchResult = person1;
            }
        }
        return searchResult;
    }

}
