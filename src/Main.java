public class Main {
    static int max1 = Integer.MIN_VALUE;
    static int max2 = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] array = new int[]{-1000, 2, 2, 21, 0, 2, 2};

        int indexOfMax1 = max(array, -1);
        int indexOfMax2 = max(array, indexOfMax1);

        max1 = array[indexOfMax1];
        max2 = array[indexOfMax2];

//        max1 = array[0];
//        max2 = Integer.MIN_VALUE;
//        twoMaxFromArray(array);


//        int []array = new int[] {1,2};
//        if (array.length == 0) {
//            System.out.println("Пустой массив");
//            return;
//        }
//        if (array.length == 1) {
//            System.out.printf("В массиве один элемент:   %d", array[0]);
//            return;
//        }
//        for (int i = 1; i < array.length; i++) {
//            if (max1 < array[i]) {
//                max2 = max1;
//                max1 = array[i];
//            } else if (max2 < array[i]) max2 = array[i];
//        }
//        int max1 = Math.max(array[0], array[1]);
//        int max2 = Math.min(array[0], array[1]);
//        for (int i = 1; i < array.length; i++) {
//            if (max1 < array[i]) {
//                max2 = max1;
//                max1 = array[i];
//            } else if (max2 < array[i]) max2 = array[i];
//        }
//        boolean firstIteration = true;
//        for (int i : array){
//            if (firstIteration) firstIteration = false;
//            else
//                if (max1 < i) {
//                    max2 = max1;
//                    max1 =i;
//                }
//                else if (max2 < i) max2 = i;
//            }
        System.out.printf("Самый большой элемент массива: %d\n", max1);
        System.out.printf("Второй по величине элемент массива: %d", max2);
    }

    public static void twoMaxFromArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (max1 < array[i]) {
                max2 = max1;
                max1 = array[i];
            } else if (max2 < array[i]) max2 = array[i];
        }

    }

    public static int max(int[] array, int skip) {
        int indexOfMax = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (i != skip){
                if (array[i] > max) {
                    max = array[i];
                    indexOfMax = i;
                }
            }
        }
        return indexOfMax;
    }

}

