/*
Створіть інтерфейс ISort. В ньому мають бути два методи
 void SortAsc() – сортування по зростанню
 void SortDesc() – сортування по спаданню
Клас Array, створений раніше, повинен імплементувати інтерфейс ISort.
Метод SortAsc – сортує масив по зростанню.
Метод SortDesc – сортує масив по спаданню.
Напишіть код для тестування отриманої функціональності.
 */

public class Main {
    public static void main(String[] args) {
        int[] data = {5, 3, 8, 1, 2, 7};
        Array array = new Array(data);

        System.out.println("Original array:");
        array.printArray();

        array.SortAsc();
        System.out.println("Sorted in ascending order:");
        array.printArray();

        array.SortDesc();
        System.out.println("Sorted in descending order:");
        array.printArray();
    }
}