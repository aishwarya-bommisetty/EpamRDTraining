package com.epam.training.Arrays.Arrays;
import java.util.Arrays;
/**
 *
 * @author Aishwarya_Bommisetty
 *
 */
public final class ArraysTest {
    /**
     *
     */
    private ArraysTest() {

    }
    /**
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        int[] arr = {2, 2, 2};
        Array a = new Array();
        System.out.println(a.join(arr));
        a.sumAndAverage(arr);
        System.out.println(Arrays.toString(a.normalization(arr)));
    }

}
