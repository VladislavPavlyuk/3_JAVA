//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        Array array = new Array(numbers);

        System.out.println("Max: " + array.Max());
        System.out.println("Min: " + array.Min());
        System.out.println("Avg: " + array.Avg());
        }
    }
