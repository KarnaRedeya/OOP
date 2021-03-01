import java.util.Scanner;

public class Waktu{

     public static void main(String []args){
        // var
        Scanner Myobject = new Scanner(System.in);
        System.out.print( "Enter an integer for seconds : " );
        Integer inputUser = Myobject.nextInt();
        int p1 = inputUser / 60;
        int p2 = inputUser % 60;
        System.out.println( inputUser + " Seconds is " + p1 + " Minutes and " + p2 + " Secounds ");
     }
}