// Клас Array, який імплементує інтерфейс IMath
public class Array implements IMath {
    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    @Override
    public int Max() {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @Override
    public int Min() {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public float Avg() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (float) sum / array.length;
    }
}

