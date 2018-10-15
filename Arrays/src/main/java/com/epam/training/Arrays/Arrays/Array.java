package com.epam.training.Arrays.Arrays;

/**
 *
 * @author Aishwarya_Bommisetty
 *
 */
public class Array {

    /**
     *
     * @param arr array input
     * @param seperator the delimiter for join method
     * @return a joined String of array elements
     */
String join(final int[] arr, final char... seperator) {
    String result = new String("");
    if (seperator.length != 0) {
    for (int i = 0; i < arr.length; i++) {
        result += arr[i];
        if (i != arr.length - 1) {
            result += seperator[0] + " ";
        }
    }
    } else {
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i != arr.length - 1) {
                result += ", ";
            }
        }
    }
    return result;
}

/**
 *
 * @param arr array
 * @return sum
 */
private int sum(final int[] arr) {
    int sum = 0;
    for (int element:arr) {
        sum += element;
    }
    return sum;
}
/**
 *
 * @param arr array
 */
void sumAndAverage(final int[] arr) {
    int avg = 0;
    int sum = sum(arr);
    avg = sum / arr.length;
    System.out.println(sum + " " + avg);
}

/**
 *
 * @param arr array
 * @return normalized array
 */
double[] normalization(final int[] arr) {
      double[] norm = new double[arr.length];
      int sum = sum(arr);
      for (int i = 0; i < arr.length; i++) {
          norm[i] = (double) arr[i] / sum;

      }
      return norm;
}
}
