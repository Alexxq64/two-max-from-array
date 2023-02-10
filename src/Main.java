public class Main {
    static int max1 = Integer.MIN_VALUE;
    static int max2 = max1;

    public static void main(String[] args) {
        int[] array = new int[]{1000, 2, 2, 21, 0, 2, 2};
        for (int i : array) {
            if (max1 < i) {
                max2 = max1;
                max1 = i;
            } else if (max2 < i) max2 = i;
        }
        System.out.printf("Самый большой элемент массива: %d\n", max1);
        System.out.printf("Второй по величине элемент массива: %d", max2);
    }

}

