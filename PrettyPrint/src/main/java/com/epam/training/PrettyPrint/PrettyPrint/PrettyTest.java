package com.epam.training.PrettyPrint.PrettyPrint;

/**
 * Hello world!
 *
 */
public class PrettyTest
{
    public static void main( String[] args )
    {
        int[][] arr= {
                {0,1,2,3},
                {1,2,3,4},
                {2,3,4,1},
                {1,2,3,4}
        };
        Print p=new Print();
        p.PrettyPrinter(arr);
        p.sumPrinter(arr);
    }
}
