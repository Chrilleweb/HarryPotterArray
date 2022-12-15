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
}
