package com.epam.training.Training;

public class GCD {
    int greatestCommonDivisor(int a,int b) {
        if(a == 0)
            return b;
        while(b!=0)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        return a;
    }
}


