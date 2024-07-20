// Похідний клас "Віолончель"
class Cello extends MusicalInstrument {
    public Cello(String name, String characteristics) {
        super(name, characteristics);
    }

    @Override
    public void sound() {
        System.out.println("Віолончель видає глибокий і насичений звук.");
    }

    @Override
    public void history() {
        System.out.println("Віолончель була створена в Італії в 16 столітті.");
    }
}
