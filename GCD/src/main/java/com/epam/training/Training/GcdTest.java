package com.epam.training.Training;
import java.util.*;
/**
 * Hello world!
 *
 */
public class GcdTest
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        sc.close();
        GCD obj=new GCD();
        GCDRecursive obj2=new GCDRecursive();
        System.out.println("The GCD of "+input1+" and "+input2+" is:"+obj.greatestCommonDivisor(input1, input2));
        System.out.println("The GCD of "+input1+" and "+input2+" is:"+obj2.greatestCommonDivisor(input1, input2));
    }
}
