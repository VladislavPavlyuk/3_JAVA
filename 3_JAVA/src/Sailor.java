import java.time.LocalDate;

// Клас Sailor, що наслідує Human
public class Sailor extends Human {
    private String shipName;
    private String activity;

    public Sailor(Human human, String shipName) {
        super(human.getName(),human.getDateOfBirth());
        this.shipName = shipName;
        this.activity = "sailing tankers";
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ship Name: " + shipName);
        super.activity();
        System.out.println(" and " + activity + ".");
    }
}

