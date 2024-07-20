// Клас Array, що імплементує інтерфейс ISort
public class Array implements ISort {
    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    @Override
    public void SortAsc() {
        java.util.Arrays.sort(array);
    }

    @Override
    public void SortDesc() {
        java.util.Arrays.sort(array);
        reverseArray();
    }

    private void reverseArray() {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }

    public void printArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


