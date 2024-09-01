package largest.of.three.number;

import java.util.Scanner;

public class LargestNumberExample1 {
    public static void main (String[] args){
    int a, b, c, largest, temp;
    // object of the Scanner class
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first numbe:");
    a=sc.nextInt();
    System.out.println("Enter the second number ");
    b=sc.nextInt();
    System.out.println("Enter the third number ");
    c=sc.nextInt();
    // comparing a and b and strong the largest number in a temp variable
    temp=a>b?a:b;
    // Comparing temp variable with c and storing the result in the variable
    largest =c >temp?c:temp;
    //print the largest number
    System.out.println("The largest number is : "+largest);
}

}
