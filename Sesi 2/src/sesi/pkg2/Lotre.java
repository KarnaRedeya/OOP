package sesi.pkg2;

import java.util.Scanner;
import java.util.*;

public class Lotre {

    public static void main(String[] args) {

        Scanner Myobject = new Scanner(System.in);
        System.out.print("Input Angka : ");
        int inputUser = Myobject.nextInt();

        Random AngkaAcak = new Random();
        System.out.println("Nomer Lotre : ");
        System.out.println("---------------- ");
        int a = AngkaAcak.nextInt(99);
        if (a < 10 ){
            System.out.println("0" + a);
        }else {
            System.out.println(a);
        }
        System.out.println("---------------- ");
        int belakang = a%10 ;
        int depan = a/10;
        if (a < 10 ){
            depan = 0;
        }
        System.out.println(belakang);
        System.out.println(depan);
        if ( a == inputUser ){
            System.out.println("$ 10.000");
        } else if (inputUser%10 == depan && inputUser/10 == belakang) {
            System.out.println("$ 3.000");
        } else if (inputUser/10 == depan || inputUser/10 == belakang || inputUser%10 == depan || inputUser %10 == belakang ) {
            System.out.println("$ 1.000");
        }else {
            System.out.println("Gagal");
        }
    }
}