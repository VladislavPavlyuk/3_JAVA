// Похідний клас Автомобіль
class Car extends Device {
    Car(Device device, String name, String characteristics) {
        super(name, characteristics);
    }

    @Override
    void sound() {
        System.out.println("Автомобіль гуде.");
    }
}
