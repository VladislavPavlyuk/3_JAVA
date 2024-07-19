import java.time.LocalDate;
import java.time.LocalDateTime;

enum Gender {Male, Female}
enum Type {Amphibian, Bird, Fish, Invertebrate, Mammal, Reptile}

public class Animal {
    private Type type;
    private Gender gender;
    private String dateOfBirthString;
    private String name;
    private LocalDate dateOfBirth;


    public Animal(String name, String type, String gender, String dateOfBirthString) {
        this.name = name;
        this.type = Type.valueOf(type);
        this.gender = Gender.valueOf(gender);
        this.dateOfBirthString = dateOfBirthString;
        this.dateOfBirth = LocalDate.parse(dateOfBirthString);
    }
    public Type getType() {
        return Type.valueOf(type.name());
    }

    public void setType(String type) {
        if (Type.valueOf(type)!=null)
            this.type = Type.valueOf(type);
        else throw new IllegalArgumentException();
    }

    public Gender getGender() {
        return Gender.valueOf(gender.name());
    }

    public void setGender(String gender) {
        if (Gender.valueOf(gender)!=null)
        this.gender = Gender.valueOf(gender);
        else throw new IllegalArgumentException();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirthString){
        LocalDate date = LocalDate.parse(dateOfBirthString);
        this.dateOfBirth = date;
    }
    public String getDateOfBirth() {
        return dateOfBirth.toString();
    }

    public int getAge(){
        LocalDateTime localDateTime = LocalDateTime.now();
        int age = localDateTime.getYear() - this.dateOfBirth.getYear();
        return age;
    }

    public void activity(){
        System.out.println("Activity is eating, sleeping");
    }

    public void displayInfo() {

        System.out.println("Name: " + this.name
                + ", Age: " + getAge()
        + ", Type: " + getType()
        + ", Gender: " + getGender());
    }
}