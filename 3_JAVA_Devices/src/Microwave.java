// Похідний клас Мікрохвильовка
class Microwave extends Device {
    Microwave(Device device,String name, String characteristics) {
        super(name, characteristics);
    }

    @Override
    void sound() {
        System.out.println("Мікрохвильовка дзижчить.");
    }
}
