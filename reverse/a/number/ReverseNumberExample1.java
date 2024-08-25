package reverse.a.number;

public class ReverseNumberExample1 {
    public static void main(String args[]){
        int number =34978,reverse =0;
        // we have not  mentioned the initialization part of the for loop
        for(;number!=0;number=number/10){
            int reminder=number%10;
            reverse =reverse*10+reminder;
        }
        System.out.println("The reverse  of  given number :-" +reverse);
    }
}
