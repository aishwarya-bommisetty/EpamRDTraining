package com.epam.training.PrettyPrint.PrettyPrint;

public class Print {
void PrettyPrinter(int[][] arr)
{
    System.out.println("Pretty Print:");
   for(int i=0;i<arr.length;i++)
   {
       for(int j=0;j<arr[i].length;j++)
       {
           System.out.print(arr[i][j]+" ");
       }
       System.out.println();
   }
}
void sumPrinter(int[][] arr)
{
    int[] rowSum=new int[arr.length];
    int[] columnSum=new int[arr[0].length];
    int diagonalSum=0;
    for(int i=0;i<arr.length;i++)
    {
        int sum=0;
        for(int j=0;j<arr[i].length;j++)
        {
            sum+=arr[i][j];
        }
       rowSum[i]=sum;
    }
    for(int i=0;i<arr[0].length;i++)
    {
        int sum=0;
        for(int j=0;j<arr.length;j++)
        {
            sum+=arr[j][i];
        }
       columnSum[i]=sum;
    }
    for(int i=0;i<arr.length;i++)
    {
       diagonalSum+= arr[i][i];
    }
    System.out.println("Sum Print:");
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println("| "+rowSum[i]);
    }
    int count=1;
    while(count!=arr.length*2)
    {
    System.out.print("-");
    count++;
    }
    System.out.println("/");
    for(int i:columnSum)
    {
        System.out.print(i+" ");
    }
    System.out.print("  "+diagonalSum);
}
}
