/*
Завдання 1:
Вивести на екран надпис "Your time is limited, so don’t waste it living someone else’s life" Steve Jobs в різних рядках.
Приклад виводу:
“Your time is limited,
so don’t waste it
living someone else’s life”
Steve Jobs

Завдання 2:
Користувач вводить з клавіатури два числа. Перше число — це значення, друге число — відсоток, який необхідно підрахувати.
Наприклад, ми ввели з клавіатури 50 і 10. Потрібно вивести на екран 10 відсотків від 50. Результат — 5.

Завдання 3:
Користувач вводить з клавіатури 3 числа. Необхідно створити число, що містить ці числа.
Наприклад, якщо з клавіатури введено 7, 3, 8, тоді потрібно сформувати число 738.

Завдання 4:
Користувач вводить шестизначне число. Необхідно змінити в цьому числі перше і шосте число, а також друге і п’яте число.
Наприклад, 723895 повинно перетворитися на 593827
Якщо користувач ввів не шестизначне число потрібно вивести повідомлення про помилку.

Завдання 5:
Користувач вводить з клавіатури номер місяця(1-12). В залежності від отриманого номера програма виводить на екран надпис :
Winter (якщо введене значення 1,2 або 12), Spring (якщо введене значення від 3 до 5), Summer (якщо введене значення від 6 до 8), Autumn (якщо введене значення від 9 до 11).
Якщо користувач ввів значення не в діапазоні від 1 до 12 потрібно вивести повідомлення про помилку.

Завдання 6:
Користувач вводить з клавіатури кількість метрів. В залежності від вибору користувача програма переводить метри в милі, дюйми чи ярди
Завдання 7:
Користувач вводить з клавіатури два числа. Потрібно вивести всі непарні числа в вказаному діапазоні. Якщо границі вказані не вірно потрібно провести нормалізацію границь. Наприклад, якщо ввели 20 і 11, потрібна нормалізація, після якої початок стане рівним 11, а кінець 20.
Завдання 8:
Показати на екрані таблицю множення в діапазоні, вказаному користувачем. Наприклад, якщо користувач вказав 3 і 5, таблиця може виглядати так
3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30
……………………………………………………
5*1 = 5 5 *2 = 10 5 *3 = 15 ………….
Завдання 9:
В одномірному масиві, заповненому випадковими числами, визначаємо мінімальне і максимальне значення, підраховуємо кількість від’ємних значень, підраховуємо кількість додатних значень, підраховуємо кількість нулів. Результат виводимо на екран.
Завдання 10:
Маємо одновимірний масив, заповнений випадковими числами. На основі даних масиву потрібно:
 Створити одновимірний масив, що містить лише парні числа з першого масиву
 Створити одновимірний масив, що містить лише непарні числа з першого масиву
 Створити одновимірний масив, що містить лише від’ємні числа з першого масиву
 Створити одновимірний масив, що містить лише додатні числа з першого масиву
3
Завдання 11:
Написати метод, що відображає вертикальну або горизонтальну лінію із деяких символів. Метод приймає в якості параметрів: довжину лінії, напрям, символ.
Завдання 12:
Написати метод, що сортує масив по спаданню або зростанню в залежності від вибору користувача*/

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Task 5");
        enum Seasons{
            Winter,
            Spring,
            Summer,
            Autumn
        }
        enum Months {
            January,
            February,
            March,
            April,
            May,
            June,
            July,
            August,
            September,
            October,
            November,
            December
        }
        Scanner myObj4 = new Scanner(System.in);
        System.out.println("Enter 1 - 12 month number:");
        int monthNumber = myObj4.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number");
        } else {
            switch (monthNumber) {
                case 1:
                    System.out.println(Months.January + " " + Seasons.Winter.name());
                    break;
                case 2:
                    System.out.println(Months.February + " " + Seasons.Winter.name());
                    break;
                case 3:
                    System.out.println(Months.March + " " + Seasons.Spring.name());
                    break;
                case 4:
                    System.out.println(Months.April + " " + Seasons.Spring.name());
                    break;
                case 5:
                    System.out.println(Months.May + " " + Seasons.Spring.name());
                    break;
                case 6:
                    System.out.println(Months.June + " " + Seasons.Summer.name());
                    break;
                case 7:
                    System.out.println(Months.July + " " + Seasons.Summer.name());
                    break;
                case 8:
                    System.out.println(Months.August + " " + Seasons.Summer.name());
                    break;
                case 9:
                    System.out.println(Months.September + " " + Seasons.Autumn.name());
                    break;
                case 10:
                    System.out.println(Months.October + " " + Seasons.Autumn.name());
                    break;
                case 11:
                    System.out.println(Months.November + " " + Seasons.Autumn.name());
                    break;
                case 12:
                    System.out.println(Months.December + " " + Seasons.Winter.name());
                    break;
                default :
                    System.out.println("Invalid month number");
                    break;
            }
        }
        System.out.println("Task 4");
        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Enter 6 digits number:");
        String str = myObj3.nextLine();
        System.out.println("Original number: " + str);
        StringBuilder str2 = new StringBuilder(str);
        if (str.length() == 6) {
            char temp = str.charAt(0);
            str2.setCharAt(0, str.charAt(5));
            str2.setCharAt(5, temp);

            temp = str.charAt(1);
            str2.setCharAt(1, str.charAt(4));
            str2.setCharAt(4, temp);

        } else {
            System.out.println("\n Your number has wrong length");
        }
        System.out.println("Result: " + str2);

        System.out.println("Task 3");
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter 1 number:");
        String number1 = myObj2.nextLine();
        System.out.println("Enter 2 number:");
        String number2 = myObj2.nextLine();
        System.out.println("Enter 3 number:");
        String number3 = myObj2.nextLine();
        String number4 = number1+number2+number3;
        System.out.println(number4);

        System.out.println("Task 2");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = Integer.parseInt(myObj.nextLine());
        System.out.println("Number is: " + number);
        System.out.println("Enter % percentage:");
        int percentage = Integer.parseInt(myObj.nextLine());
        System.out.println("Percentage % is: " + percentage);
        System.out.println(percentage + "% of Number is: " + number*percentage/100);


        System.out.println("Task 1");
        String str1 = "\n“Your time is limited,\n" +
                "so don’t waste it\n" +
                "living someone else’s life”\n" +
                "Steve Jobs";
        System.out.println(str1);
    }
}