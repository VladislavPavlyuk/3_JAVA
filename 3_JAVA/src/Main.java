/*
Завдання 1:
Створити клас Human, що буде містити інформацію про людину.
За допомогою механізму наслідування, реалізувати клас Builder (містить інформацію про будівельника), клас Sailor (містить інформацію про моряка), клас Pilot (містить інформацію про льотчика).
Кожен з класів має містити необхідні методи для роботи.

Завдання 2:
Створити базовий клас “Тварина” і похідні класи “Тигр”, “Крокодил”, “Кенгуру”. За допомогою конструктора встановити ім’я для кожної тварини і її характеристики.
Створити для кожного класу необхідні методи і поля.
Завдання 3:
Запрограмуйте клас Money (об’єкт класу оперує однією валютою) для роботи з грошима.
В класі має бути передбачене поле для зберігання цілої частини грошей(долари, євро, гривні) і поле для зберігання копійок (центи, євроценти, копійки і т. д.)
Реалізувати методи для виводу суми на екран, заданих значень на для частин.
На базі класу Money створити клас Product для роботи з продуктом чи товаром. Реалізувати метод, що дозволяє зменшити ціну на задане число.
Для кожного класу реалізувати необхідні методи і поля.
2
Завдання 4:
Створити базовий клас «Пристрій» і похідні класи «Чайник», «Мікрохвильовка», «Автомобіль», «Пароплав». За допомогою конструктора встановити ім’я кожного пристрою і його характеристики.
Реалізуйте для кожного з класів методи:
 Sound – видає звук пристрою (пишемо текстом в консоль)
 Show – відображає назву пристрою
 Desc – відображає опис пристрою.
Завдання 5:
Створіть базовий клас “Музичний інструмент” і похідні класи “Скрипка”, “Тромбон”, “Укулеле”, “Віолончель”. З допомогою конструктора встановити ім’я кожного музичного інструменту і його характеристики.
Реалізуйте для кожного з класів методи:
 Sound – видає звук музичного інструменту (пишемо текстом в консоль)
 Show – відображає назву музичного інструмента
 Desc – відображає опис музичного інструмента
 History – відображає історію створення музичного інструмента
Завдання 6:
Створіть інтерфейс IMath. В ньому має бути три методи:
 int Max() – повертає максимум
 int Min() – повертає мінімум
 float Avg() – повертає середнє арифметичне
Клас Array, створений раніше, повинен імплементувати інтерфейс IMath.
Метод Max – повертає максимум серед елементів масиву.
Метод Min – повертає мінімум серед елементів масив.
Метод Avg – повертає середнє арифметичне серед елементів масиву.
Напишіть код для тестування отриманого функціоналу.
3
Завдання 7:
Створіть інтерфейс ISort. В ньому мають бути два методи
 void SortAsc() – сортування по зростанню
 void SortDesc() – сортування по спаданню
Клас Array, створений раніше, повинен імплементувати інтерфейс ISort.
Метод SortAsc – сортує масив по зростанню.
Метод SortDesc – сортує масив по спаданню.
Напишіть код для тестування отриманої функціональності.
*/

public class Main {
    static void pause(){
        System.out.println("Pausing for 5 seconds...");
        try {
            Thread.sleep(5000);  // Pauses for 5000 milliseconds (5 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Continuing...\n");
    }

    public static void main(String[] args) {
        String defaultDate = "1700-01-01";

        System.out.println("Task #2");
        //String defaultDate = "1700-01-01";
        String defaultType = "Amphibian";
        String defaultGender = "Female";
        Animal animal = new Animal("",defaultType,defaultGender,defaultDate);
        animal.setGender("Male");
        animal.setDateOfBirth("2020-01-01");
        animal.setName("Raj");
        animal.setType("Mammal");
        animal.displayInfo();
        pause();

        Tiger tiger = new Tiger(animal,"Tiger");
        tiger.displayInfo();
        pause();


        System.out.println("Task #1");

        //String defaultDate = "1700-01-01";
        Human human1 = new Human("",defaultDate);
        human1.setName("Abdulla");
        human1.setDateOfBirth("1990-01-01");
        human1.displayInfo();

        Human human2 = new Human("",defaultDate);
        human2.setName("Mohammad");
        human2.setDateOfBirth("1991-02-02");
        human2.displayInfo();

        Human human3 = new Human("",defaultDate);
        human3.setName("Mary");
        human3.setDateOfBirth("1992-03-03");
        human3.displayInfo();

        Pilot pilot = new Pilot(human1,"Lufhansa");
        System.out.println("\nPilot : ");
        pilot.displayInfo();

        Sailor sailor = new Sailor(human2,"Evergreen");
        System.out.println("\nSailor : ");
        sailor.displayInfo();

        Builder builder = new Builder(human3, "Strabag");
        System.out.println("\nBuilder : ");
        builder.displayInfo();
        pause();
    }
}