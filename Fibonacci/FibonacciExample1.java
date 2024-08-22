package Fibonacci;
/*
 * In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.
 */
public class FibonacciExample1 {
    public static void main(String args[]){
        int a=0,b=1,term,i,count=10;
        System.out.print(a + " "+b);
        
            for(i=2; i < count; ++i)///loop starts from 2 because 0 and 1 are already printed
                {
                    term=a+b;
                    System.out.print(" "+term);
                    a=b;
                    b=term;
                }
        

    }
}
