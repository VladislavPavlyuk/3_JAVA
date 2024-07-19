import java.time.LocalDate;

// Клас Pilot, що наслідує Human
public class Pilot extends Human {
    private String airline;
    private String activity;

    public Pilot(Human human, String airline) {
        super(human.getName(), human.getDateOfBirth());
        this.airline = airline;
        this.activity = "flying aircrafts";
    }


    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Airline: " + airline);
        super.activity();
        System.out.println(" and " + activity + ".");
    }
}
