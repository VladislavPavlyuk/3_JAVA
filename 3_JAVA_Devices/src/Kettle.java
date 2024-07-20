// Похідний клас Чайник
class Kettle extends Device {
    Kettle(String name, String characteristics) {
        super(name, characteristics);
    }

    @Override
    void sound() {
        System.out.println("Чайник свистить.");
    }
}
