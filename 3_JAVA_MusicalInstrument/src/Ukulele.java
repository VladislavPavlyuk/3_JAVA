// Похідний клас "Укулеле"
class Ukulele extends MusicalInstrument {
    public Ukulele(String name, String characteristics) {
        super(name, characteristics);
    }

    @Override
    public void sound() {
        System.out.println("Укулеле видає легкий і веселий звук.");
    }

    @Override
    public void history() {
        System.out.println("Укулеле походить з Гаваїв і був створений в 19 столітті.");
    }
}
