package swap.two.numbers;


import java.util.Scanner;

public class SwapWith {
    public static void main(String args []){
        int x,y,t; // x and y are to swap
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y :-");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("before swapping number :- "+ x +" " + y);
        // Swapping
        t=x;
        x=y;
        y=t;
        System.out.println("After swapping :-" + x +" " + y);
        System.out.println();


    }

}
