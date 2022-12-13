public class Person {
    private String firstName;
    private String lastName;
    private int points;


    public Person(){
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = 0;
    }
    public Person(String firstName, String lastName, int points){
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int addPoints(int points){
        points += getPoints();
        return points;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " har " + points + " point";
    }
}
