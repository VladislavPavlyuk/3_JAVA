/*Завдання 6:
Реалізуйте клас “Автомобіль”. Необхідно зберігати у полях класу:
назва автомобіля,
назва виробника,
рік випуску,
об’єм двигуна.
Реалізуйте конструктори і методи класу для вводу даних, виводу даних, реалізуйте доступ до окремих полів через методи класу.
Використайте механізм перевантаження методів.  */
public class Car {
    private String model;
    private String make;
    private int year;
    private int engineVolume;

    public Car() {
        this.model = model;
        this.make = make;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        if (model != null) {
            return "Car \n[model : " + model
                    + ",\n make : " + make
                    + ",\n year : " + year
                    + ",\n engine : " + engineVolume + " cm3]\n";
        } else {
            return "Please clarify the model of the car\n";
        }
    }
}
