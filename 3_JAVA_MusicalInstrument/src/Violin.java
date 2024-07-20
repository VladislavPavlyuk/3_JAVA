// Похідний клас "Скрипка"
class Violin extends MusicalInstrument {
    public Violin(String name, String characteristics) {
        super(name, characteristics);
    }

    @Override
    public void sound() {
        System.out.println("Скрипка видає мелодійний звук.");
    }

    @Override
    public void history() {
        System.out.println("Скрипка була створена в Італії в 16 столітті.");
    }
}