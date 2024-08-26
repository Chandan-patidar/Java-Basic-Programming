package sum.of.all.natural.no;

public class SumOfNaturalNumber1 {
    public static void main(String args []) {
        int i, num = 2, sum = 0;
        //execution until the condition returns true
        for (i = 1; i <= num; i++) {
            //adding the value of i into sum variable
            sum = sum + i;
        }

        //print the sum
        System.out.println("sum of first 10 natural Number is = "+ sum);
    }
}
