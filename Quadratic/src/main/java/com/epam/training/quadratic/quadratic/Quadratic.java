package com.epam.training.quadratic.quadratic;

public class Quadratic
{
    private static double[] sqroots(final double a, final double b, final double c)
    {
        double result[]=new double[2];
        double discriminant=(b*b)-4*a*c;
           if(a==0 || discriminant<0)
           {
               return result;
           }
           else if(discriminant==0) {
               result[0]=-b/(2*a);

           }
           else
           {
               result[0]=(-b+Math.sqrt(discriminant))/(2*a);
               result[1]=(-b-Math.sqrt(discriminant))/(2*a);
           }
           return result;
    }

    static double[] Calculate(final double a, final double b, final double c)
    {
        return sqroots(a,b,c);
    }
}


