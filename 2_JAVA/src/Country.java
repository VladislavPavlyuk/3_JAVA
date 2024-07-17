/*Завдання 3:
До вже реалізованого класу “Країна” додати необхідні конструктори, в також необхідні перевантажені методи.*/

enum Continent {
    Africa,
    Antarctica,
    Australia,
    Eurasia,
    NorthAmerica,
    SouthAmerica,
    Zealandia;
    }

public class Country {
    private String name;
    private Continent continent;
    private String capitalCity;
    private int population;
    private double square;

public Country() {
    this.name = name;
    this.continent = continent;
    this.capitalCity = capitalCity;
    this.population = population;
    this.square = square;

}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Continent getContinent() {

    return continent;
    }
    public void setContinent(String continent) {

        if (Continent.valueOf(continent)!=null)
            this.continent = Continent.valueOf(continent);
        else throw new IllegalArgumentException();
    }
    public String getCapitalCity() {
    return capitalCity;
    }
    public void setCapitalCity(String capitalCity) {
    this.capitalCity = capitalCity;
    }
    public int getPopulation() {
    return population;
    }
    public void setPopulation(int population) {
    this.population = population;
    }
    public double getSquare() {
    return square;
    }
    public void setSquare(double square) {
    this.square = square;
    }

    @Override
    public String toString() {
        if (name != null) {
            return name + " is located on " + continent + "continent. The capital city of " + name + " is " + capitalCity
                    + ". The population of " + name + " is " + population
                    + "people. Total square of " + name + " is " + square + " square km.\n";
        } else {
            return "Please clarify the name of the country\n";
        }
    }

}
