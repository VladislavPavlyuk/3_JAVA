/*
Завдання 1:
        До вже реалізованого класу “Людина” додати необхідні конструктори, а також необхідні перевантажені методи*/
import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private String city;
    private String country;
    private String address;

    public void setName(String name){

        this.name = name;
    }
    public String getName(){

        return name;
    }
    public void setDateOfBirth(String date){
        LocalDate dateOfBirth = LocalDate.parse(date);
        this.dateOfBirth = dateOfBirth;
    }
    public LocalDate getDateOfBirth(){

        return dateOfBirth;
    }
    public void setPhoneNumber(String phoneNumber){

        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){

        return phoneNumber;
    }
    public void setCity(String city){

        this.city = city;
    }
    public String getCity(){

        return city;
    }
    public void setCountry(String country){

        this.country = country;
    }
    public String getCountry(){

        return country;
    }
    public void setAddress(String address){

        this.address = address;
    }
    public String getAddress(){

        return address;
    }

    public Person(){
        this.name  = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = "";
        this.city = "";
        this.country = "";
        this.address = "";
    }

    @Override
    public String toString() {
        if (name != null) {
            return name + " was born in " + dateOfBirth + " at " + city + " " + country + " currently living on " + address + " available by phone: "  + phoneNumber + ".\n";
        } else {
            return "Please clarify the name of the person\n";
        }
    }

}
