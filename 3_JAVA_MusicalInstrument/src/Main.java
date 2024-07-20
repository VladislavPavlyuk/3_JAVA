/*Створіть базовий клас “Музичний інструмент” і похідні класи “Скрипка”, “Тромбон”, “Укулеле”, “Віолончель”. З допомогою конструктора встановити ім’я кожного музичного інструменту і його характеристики.
Реалізуйте для кожного з класів методи:
 Sound – видає звук музичного інструменту (пишемо текстом в консоль)
 Show – відображає назву музичного інструмента
 Desc – відображає опис музичного інструмента
 History – відображає історію створення музичного інструмента
*/

public class Main {
    public static void main(String[] args) {
        MusicalInstrument musicalInstrument = new MusicalInstrument("","");
        Violin violin = new Violin("Скрипка", "Дерев'яний корпус, чотири струни");
        Trombone trombone = new Trombone("Тромбон", "Металевий корпус, довга трубка");
        Ukulele ukulele = new Ukulele("Укулеле", "Маленький розмір, чотири струни");
        Cello cello = new Cello("Віолончель", "Дерев'яний корпус, чотири струни, великий розмір");

        musicalInstrument.show();
        musicalInstrument.desc();
        musicalInstrument.sound();
        musicalInstrument.history();

        violin.show();
        violin.desc();
        violin.sound();
        violin.history();

        trombone.show();
        trombone.desc();
        trombone.sound();
        trombone.history();

        ukulele.show();
        ukulele.desc();
        ukulele.sound();
        ukulele.history();

        cello.show();
        cello.desc();
        cello.sound();
        cello.history();
    }
}