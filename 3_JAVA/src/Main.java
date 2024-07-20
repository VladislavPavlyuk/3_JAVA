/*
Завдання 1:
Створити клас Human, що буде містити інформацію про людину.
За допомогою механізму наслідування, реалізувати клас Builder (містить інформацію про будівельника), клас Sailor (містить інформацію про моряка), клас Pilot (містить інформацію про льотчика).
Кожен з класів має містити необхідні методи для роботи.

Завдання 2:
Створити базовий клас “Тварина” і похідні класи “Тигр”, “Крокодил”, “Кенгуру”. За допомогою конструктора встановити ім’я для кожної тварини і її характеристики.
Створити для кожного класу необхідні методи і поля.
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

        System.out.println("Task #2");

        Animal animal = new Animal("","Mammal","Female","2020-01-01");

        Tiger tiger = new Tiger(animal,"Tiger");
        tiger.setGender("Male");
        tiger.setName("Raj");
        tiger.displayInfo();
        pause();

        Crocodile crocodile = new Crocodile(animal,"Crocodile");
        crocodile.setGender("Female");
        crocodile.setName("Jina");
        crocodile.displayInfo();
        pause();

        Kangaroo kangaroo = new Kangaroo(animal,"Kangaroo");
        kangaroo.setGender("Male");
        kangaroo.setName("Kenga");
        kangaroo.displayInfo();
        pause();


        System.out.println("Task #1");

        String defaultDate = "1700-01-01";
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