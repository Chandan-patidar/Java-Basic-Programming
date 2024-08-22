/*
 Factorial Program in Java: Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:

 4! = 4*3*2*1 = 24
 5! = 5*4*3*2*1 = 120  
 */

import java.util.Scanner;

public class FactorialExample {
    public static void main (String args[] ){
        int n, fact=1;
        System.out.println("Enter any number :- ");
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
        for(int i=0;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial " + fact );
     }


}
