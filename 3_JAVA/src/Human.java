import java.time.LocalDate;
import java.time.LocalDateTime;

// Базовий клас Human
public class Human {
    private String name;
    private String dateOfBirthString;
    private LocalDate dateOfBirth;


    public Human(String name, String dateOfBirthString) {
        this.name = name;
        this.dateOfBirthString = dateOfBirthString;
        this.dateOfBirth = LocalDate.parse(dateOfBirthString);
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
        //System.out.println("Name: " + this.name + " Birth: " + this.dateOfBirthString);
        System.out.println("Name: " + this.name + ", Age: " + getAge());
    }
}


