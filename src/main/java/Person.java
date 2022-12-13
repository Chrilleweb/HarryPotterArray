public class Person {
    private String firstName;
    private String lastName;
    private int points;


    public Person(){
    }

    public Person(String firstName, String lastName, int points){
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = 0;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " har " + points + " point";
    }
}
