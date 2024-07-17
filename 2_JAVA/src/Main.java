/*
Завдання 1:
До вже реалізованого класу “Людина” додати необхідні конструктори, а також необхідні перевантажені методи
Завдання 2:
До вже реалізованого класу “Місто” додати необхідні конструктори, а також необхідні перевантажені методи
Завдання 3:
До вже реалізованого класу “Країна” додати необхідні конструктори, в також необхідні перевантажені методи.
Завдання 4:
До вже реалізованого класу “Дроби” додати необхідні конструктори, в також необхідні перевантажені методи.
Завдання 5:
Реалізуйте клас “Книга”. Необхідно зберігати в полях класу: назву книги, ПІБ автора, рік випуску, назва видавництва, жанр книги, кількість сторінок. Реалізуйте конструктори і методи класу для введення даних, реалізуйте доступ до окремих полів через методи класу. Використайте механізм перевантаження методів.
Завдання 6:
Реалізуйте клас “Автомобіль”. Необхідно зберігати у полях класу: назва автомобіля, назва виробника, рік випуску, об’єм двигуна. Реалізуйте конструктори і методи класу для вводу даних, виводу даних, реалізуйте доступ до окремих полів через методи класу. Використайте механізм перевантаження методів.
*/

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        System.out.println(book);

        book.setTitle("War and peace");
        book.setAuthor("Leo Tolstoy");
        book.setYearPublished("1869-01-01");
        book.setPublisher("Messenger");
        book.setGenre("Novel");
        book.setPages(1225);
        System.out.println(book);


        Country country = new Country();
        System.out.println(country);

        country.setName("Ukraine");
        country.setContinent("Eurasia");
        country.setCapitalCity("Kyiv");
        country.setPopulation(41130432);
        country.setSquare(603550);
        System.out.println(country);


        City city = new City();
        System.out.println(city);

        city.setName("New York");
        city.setCountry("USA");
        city.setState("New York");
        city.setPopulation(19680000);
        city.setEstablished("1624-01-01");
        city.setSquare(302.6);
        System.out.println(city);

        Person person = new Person();
        System.out.println(person);

        person.setName("Elon Mask");
        person.setDateOfBirth("1971-06-28");
        person.setPhoneNumber("322-223");
        person.setCity("Pretoria");
        person.setCountry("USA");
        person.setAddress("Boca Chica, Texas");

        System.out.println(person);

        System.out.println(person.getName());

        person.setName("Jone Jones");

        System.out.println(person.getName());


        Fraction f1 = new Fraction(2,3);
        System.out.println("F1 = " + f1);
        Fraction f2 = new Fraction(3,4);
        System.out.println("F2 = " + f2);


        Fraction result = new Fraction(0);

        result = result.add(f1,f2);
        System.out.println("F1 + F2 = " + result);

        result = result.sub(f1,f2);
        System.out.println("F1 - F2 = " + result);

        result = result.mul(f1,f2);
        System.out.println("F1 * F2 = " + result);

        result = result.div(f1,f2);
        System.out.println("F1 / F2 = " + result);

    }
}