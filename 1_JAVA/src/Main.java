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
Користувач вводить з клавіатури кількість метрів. В залежності від вибору користувача програма переводить метри в милі,
дюйми чи ярди

Завдання 7:
Користувач вводить з клавіатури два числа. Потрібно вивести всі непарні числа в вказаному діапазоні.
Якщо границі вказані не вірно потрібно провести нормалізацію границь. Наприклад, якщо ввели 20 і 11, потрібна нормалізація,
після якої початок стане рівним 11, а кінець 20.

Завдання 8:
Показати на екрані таблицю множення в діапазоні, вказаному користувачем. Наприклад, якщо користувач вказав 3 і 5,
таблиця може виглядати так
3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30
……………………………………………………
5*1 = 5 5 *2 = 10 5 *3 = 15 ………….

Завдання 9:
В одномірному масиві, заповненому випадковими числами,
визначаємо мінімальне і максимальне значення,
підраховуємо кількість від’ємних значень,
підраховуємо кількість додатних значень,
підраховуємо кількість нулів.
Результат виводимо на екран.

Завдання 10:
Маємо одновимірний масив, заповнений випадковими числами. На основі даних масиву потрібно:
 Створити одновимірний масив, що містить лише парні числа з першого масиву
 Створити одновимірний масив, що містить лише непарні числа з першого масиву
 Створити одновимірний масив, що містить лише від’ємні числа з першого масиву
 Створити одновимірний масив, що містить лише додатні числа з першого масиву

Завдання 11:
Написати метод, що відображає вертикальну або горизонтальну лінію із деяких символів.
Метод приймає в якості параметрів: довжину лінії, напрям, символ.

Завдання 12:
Написати метод, що сортує масив по спаданню або зростанню в залежності від вибору користувача*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;


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

    static void printArray(ArrayList <Integer> a){
        if (a.size() > 0){
            int x = 0;
            while (x < a.size()) {
                System.out.print(a.get(x) + "\t");
                x++;

                if (x % 20 == 0)   System.out.print("\n");
                }
            }
        System.out.print("\n");
        }

    static ArrayList evens(ArrayList <Integer> array){
        ArrayList<Integer> evens = new ArrayList<Integer>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                evens.add(array.get(i));
            }
        }
        return evens;
    }

    static ArrayList odds(ArrayList <Integer> array){
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0) {
                odds.add(array.get(i));
            }
        }
        return odds;
    }

    static ArrayList negatives(ArrayList <Integer> array){
        ArrayList<Integer> negatives = new ArrayList<Integer>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < 0) {
                negatives.add(array.get(i));
            }
        }
        return negatives;
    }

    static ArrayList positives(ArrayList <Integer> array){
        ArrayList<Integer> negatives = new ArrayList<Integer>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > 0) {
                negatives.add(array.get(i));
            }
        }
        return negatives;
    }

    static ArrayList array(int arraySize){
        Random rand = new Random();
        ArrayList<Integer> arr1 = new ArrayList<Integer>(arraySize);
        for (int i = 0; i < arraySize; i++) {
            arr1.add(rand.nextInt(arraySize * 10) - arraySize * 5);
        }
        return arr1;
    }

    static void  multiplyTable(int start, int finish){
        for (int j = 0; j <= 9; j++) {
            for (int i = start; i <= finish; i++) {
                System.out.print(i + " x " + j + " = " + i * j + "\t\t");
            }
            System.out.print("\n");
        }
    }

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

    static void printMonth(Months month , Seasons season){
        System.out.println("Month : " + month + " " + " Season : " + season);
    }

    public static void printHorizontal(int length, char symbol){
        for (int i = 1; i <= length; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static void printVertical(int length, char symbol){
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length/4; j++) {
                System.out.print(" ");
            }
            System.out.println(symbol);
        }
    }

    public static ArrayList<Integer> accentSort(ArrayList<Integer> array){
        Collections.sort(array);
        return array;
    }

    public static ArrayList<Integer> decsentSort(ArrayList<Integer> array){
        Collections.sort(array,Collections.reverseOrder());
        return array;
    }
    public static void main(String[] args) throws IOException {

        System.out.println("\nTask 12");
        Scanner myObj12 = new Scanner(System.in);
        ArrayList<Integer> arr3 = array(100);
        printArray(arr3);

        System.out.print("Select (a)ccent or (d)ecent sorting array: ");
        char sortDirection = myObj12.next().charAt(0);
        switch (sortDirection) {
            case 'a':
                printArray(accentSort(arr3));
                break;
            case 'd':
                printArray(decsentSort(arr3));
                break;
            default:
                System.out.println("Invalid sort direction");

        }
        pause();

        System.out.println("\nTask 11");
        Scanner myObj11 = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = myObj11.nextInt();
        System.out.print("Enter direction (v)ertical or (h)orizontal: ");
        char direction = myObj11.next().charAt(0);
        System.out.print("Enter symbol: ");
        char symbol = myObj11.next().charAt(0);
        switch(direction){
            case 'v':
                printVertical(length,symbol);
                break;
            case 'h':
                printHorizontal(length,symbol);
                break;
            default:
                System.out.println("Invalid direction");
        }
        pause();

        System.out.println("\nTask 10");
        ArrayList<Integer> arr2 = array(100); //Маємо одновимірний масив, заповнений випадковими числами. На основі даних масиву потрібно:
        System.out.println("Random array : ");
        printArray(arr2);
        pause();

        ArrayList<Integer> e = evens(arr2);//Створити одновимірний масив, що містить лише парні числа з першого масиву
        System.out.println("Evens : ");
        printArray(e);
        pause();

        ArrayList<Integer> o = odds(arr2); //Створити одновимірний масив, що містить лише непарні числа з першого масиву
        System.out.println("Odds : ");
        printArray(o);
        pause();

        ArrayList<Integer> n = negatives(arr2);//Створити одновимірний масив, що містить лише від’ємні числа з першого масиву
        System.out.println("Negatives : ");
        printArray(n);
        pause();

        ArrayList<Integer> p = positives(arr2); //Створити одновимірний масив, що містить лише додатні числа з першого масиву
        System.out.println("Positives : ");
        printArray(p);
        pause();


        System.out.println("\nTask 9");
        ArrayList<Integer> arr1 = array(100);
        System.out.println("Random array:");
        printArray(arr1);

        // визначаємо мінімальне і максимальне значення,
        int max = Collections.max(arr1);
        int min = Collections.min(arr1);
        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;

        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) < 0) countNegative++;     // підраховуємо кількість від’ємних значень,
            if (arr1.get(i) > 0) countPositive++;     // підраховуємо кількість додатних значень,
            if (arr1.get(i) == 0) countZero++;          // підраховуємо кількість нулів.
        }

        System.out.println("Result : " + "\t"
                + "Max : " + max + "\t"
                + "Min : " + min + "\t"
                + "Negatives : " + countNegative + "\t"
                + "Positives : " + countPositive + "\t"
                + "Zeros : " + countZero + "\n");
        pause();


        System.out.println("\nTask 8");
        multiplyTable(0, 9);
        Scanner myObj8 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int start = myObj8.nextInt();
        System.out.print("Enter second number: ");
        int finish = myObj8.nextInt();
        multiplyTable(start, finish);
        pause();

        System.out.println("\nTask 7");
        Scanner myObj7 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = myObj7.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = myObj7.nextInt();
        if (firstNum > secondNum) {
            int temp = firstNum;    //нормалізацію границь
            firstNum = secondNum;
            secondNum = temp;
        }
        System.out.println("Result : ");
        for (int i = firstNum; i <= secondNum; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        pause();

        System.out.println("\nTask 6");
        Scanner myObj6 = new Scanner(System.in);
        System.out.println("Enter meters : ");
        int meters = myObj6.nextInt();
        System.out.println("Convert " + meters + " meters into (1)miles, (2)inches, (3)yards");
        System.out.print("Please select (1 - 3) : ");
        int select = myObj6.nextInt();
        if (select < 1 || select > 3) {
            System.out.println("Invalid selection");
        } else {
            switch (select) {
                case 1:
                    System.out.println(meters + " meters = " + (meters * 1.609) + " miles");
                    break;
                case 2:
                    System.out.println(meters + " meters = " + (meters * 0.0254) + " inches");
                    break;
                case 3:
                    System.out.println(meters + " meters = " + (meters * 0.9144) + " yards");
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
        pause();

        System.out.println("\nTask 5");
        Scanner myObj4 = new Scanner(System.in);
        System.out.print("Enter 1 - 12 month number: ");
        int monthNumber = myObj4.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number");
        } else {
            System.out.println("Result: ");
            switch (monthNumber) {
                case 1:
                    printMonth(Months.January, Seasons.Winter);
                    break;
                case 2:
                    printMonth(Months.February, Seasons.Winter);
                    break;
                case 3:
                    printMonth(Months.March, Seasons.Spring);
                    break;
                case 4:
                    printMonth(Months.April, Seasons.Spring);
                    break;
                case 5:
                    printMonth(Months.May, Seasons.Spring);
                    break;
                case 6:
                    printMonth(Months.June, Seasons.Summer);
                    break;
                case 7:
                    printMonth(Months.July, Seasons.Summer);
                    break;
                case 8:
                    printMonth(Months.August, Seasons.Summer);
                    break;
                case 9:
                    printMonth(Months.September, Seasons.Autumn);
                    break;
                case 10:
                    printMonth(Months.October, Seasons.Autumn);
                    break;
                case 11:
                    printMonth(Months.November, Seasons.Autumn);
                    break;
                case 12:
                    printMonth(Months.December, Seasons.Winter);
                    break;
                default:
                    System.out.println("Invalid month number");
                    break;
            }
        }
        pause();


        System.out.println("\nTask 4");
        Scanner myObj3 = new Scanner(System.in);
        System.out.print("Enter 6 digits number: ");
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
        pause();


        System.out.println("\nTask 3");
        Scanner myObj2 = new Scanner(System.in);
        System.out.print("Enter 1 number: ");
        String number1 = myObj2.nextLine();
        System.out.print("Enter 2 number: ");
        String number2 = myObj2.nextLine();
        System.out.print("Enter 3 number: ");
        String number3 = myObj2.nextLine();
        String number4 = number1 + number2 + number3;
        System.out.println("Result: " + number4);
        pause();


        System.out.println("\nTask 2");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = Integer.parseInt(myObj.nextLine());
        System.out.println("Number is: " + number);
        System.out.print ("Enter % percentage: ");
        int percentage = Integer.parseInt(myObj.nextLine());
        System.out.println("Percentage % is: " + percentage);
        System.out.println("Result : " + percentage + "% of Number is: " + number * percentage / 100);
        pause();


        System.out.println("\nTask 1");
        String str1 = "\n“Your time is limited,\n" +
                "so don’t waste it\n" +
                "living someone else’s life”\n" +
                "Steve Jobs";
        System.out.println(str1);
    }
}