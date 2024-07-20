// Похідний клас Пароплав
class Steamboat extends Device {
    Steamboat(Device device, String name, String characteristics) {
        super(name, characteristics);
    }

    @Override
    void sound() {
        System.out.println("Пароплав гудить.");
    }
}
