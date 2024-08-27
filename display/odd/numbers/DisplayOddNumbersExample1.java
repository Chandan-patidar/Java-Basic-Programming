package display.odd.numbers;

public class DisplayOddNumbersExample1 {
    public static void  main(String args[]){
        int number =100;
        System.out.println("List of odd number from 1 to "+ number + ":");
        for(int i=1;i<=number;i++){
            // logic to check if the number is odd or not
            // if (i%2 is equal to zero ,than number is odd)
            if(i%2!=0){
                System.out.println(i+" ");
            }
        }
    }
}
