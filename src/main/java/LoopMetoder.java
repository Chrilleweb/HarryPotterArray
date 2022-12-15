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

    public Person findMaximum(Person[] persons) {
        Person maximumPerson = persons[0];
        for (Person person : persons) {
            if (person.getPoints() > maximumPerson.getPoints()) {
                maximumPerson = person;
            }
        }
        return maximumPerson;
    }

    public double calculateAverage(Person[] persons) {
        int totalPoints = 0;
        int numPeople = persons.length;
        for (Person person : persons) {
            totalPoints += person.getPoints();
        }
        return totalPoints / (double) numPeople;
    }

    public Person findByFirstName(Person[] personer, String name){
        Person searchResult = personer[0];
        for (Person person1 : personer){
            if (person1.getFirstName().equals(name)){
               searchResult = person1;
            }
        }
        return searchResult;
    }

}
