package com.epam.training.Training;

public class GCDRecursive {
    int greatestCommonDivisor(int a,int b) {
        if(b != 0)
            return greatestCommonDivisor(a,a%b);
        else
            return a;
    }
}
