/*Завдання 2:
        До вже реалізованого класу “Місто” додати необхідні конструктори, а також необхідні перевантажені методи*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class City {
    private String name;
    private LocalDate established;
    private String state;
    private String country;
    private int population;
    private double square;

public City() {
    this.name = name;
    this.established = established;
    this.state = state;
    this.country = country;
    this.population = population;
    this.square = square;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

public LocalDate getEstablished() {
    return established;
}
public void setEstablished(String date){
    LocalDate established = LocalDate.parse(date);
    this.established = established;
}
public String getState() {
    return state;
}
public void setState(String state) {
    this.state = state;
}

public String getCountry() {
    return country;
}
public void setCountry(String country) {
    this.country = country;
}

public int getPopulation() {
    return population;
}
public void setPopulation(int population) {
    this.population = population;
}

public double getSquare() { return square; }
public void setSquare(double square) { this.square = square; }

    @Override
    public String toString() {
        if (name != null) {
            return name + " city was established at " + established.format(DateTimeFormatter.ofPattern("yyyy"))
                    + " in the " + country + ". Now it is the capital city of " + state + " state."
                    + " Currently there're living " + population
                    + " people on " + square + " miles in " + name + ".\n";
        } else {
            return "Please clarify the name of the city\n";
        }
    }

}