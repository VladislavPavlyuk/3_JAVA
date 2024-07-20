// Похідний клас "Тромбон"
class Trombone extends MusicalInstrument {
    public Trombone(String name, String characteristics) {
        super(name, characteristics);
    }

    @Override
    public void sound() {
        System.out.println("Тромбон видає гучний і глибокий звук.");
    }

    @Override
    public void history() {
        System.out.println("Тромбон був створений в 15 столітті.");
    }
}