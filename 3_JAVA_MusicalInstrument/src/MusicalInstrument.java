// Базовий клас "Музичний інструмент"
class MusicalInstrument {
    String name;
    String characteristics;

    public MusicalInstrument(String name, String characteristics) {
        this.name = name;
        this.characteristics = characteristics;
    }

    public void sound() {
        System.out.println("Звук музичного інструменту.");
    }

    public void show() {
        System.out.println("\nНазва інструменту: " + name);
    }

    public void desc() {
        System.out.println("Опис: " + characteristics);
    }

    public void history() {
        System.out.println("Історія створення музичного інструменту.");
    }
}









