import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private String city;
    private String country;
    private String adress;

    public void setName(String name){

        this.name = name;
    }
    public String getName(){

        return name;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){

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
    public void setAdress(String adress){

        this.adress = adress;
    }
    public String getAdress(){

        return adress;
    }

    public Person(){
        this.name  = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = "";
        this.city = "";
        this.country = "";
        this.adress = "";
    }


}
