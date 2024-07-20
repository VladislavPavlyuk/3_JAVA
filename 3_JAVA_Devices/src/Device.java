// Базовий клас Пристрій
class Device {
    String name;
    String characteristics;

    // Конструктор
    Device(String name, String characteristics) {
        this.name = name;
        this.characteristics = characteristics;
    }

    // Метод Sound
    void sound() {
        System.out.println("Пристрій видає звук.");
    }

    // Метод Show
    void show() {
        System.out.println("\nНазва пристрою: " + name);
    }

    // Метод Desc
    void desc() {
        System.out.println("Опис пристрою: " + characteristics);
    }
}






