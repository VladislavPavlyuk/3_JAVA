
public class Kangaroo extends Animal {
    private String animalName;
    private String activity;

    public Kangaroo(Animal animal, String animalName) {
        super(animal.getName(), animal.getType().name(), animal.getGender().name(),animal.getDateOfBirth());
        this.animalName = animalName;
        this.activity = "jumping";
    }


    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Animal: " + animalName);
        super.activity();
        System.out.println(" and " + activity + ".");
    }
}


