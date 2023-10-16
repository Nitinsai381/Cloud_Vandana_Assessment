package Java;

//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.Arrays;
import java.util.Random;

public class Array_Shuffle {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        shuffleArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random r = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

// Output : [2, 6, 3, 4, 5, 7, 1]
