package sesi.pkg4;

import java.io.BufferedReader; //fungsinya untuk mengimport library java
import java.io.InputStreamReader; //fungsinya untuk mengimport library java
import java.util.Scanner; //fungsinya untuk mengimport library java

public class Sesi4 {

    public static void main(String[] args) throws Exception {
        BufferedReader kata = new BufferedReader(new InputStreamReader(System.in)); // menginput nama kota dari keyboard menggunakan BufferedReader
        int a; // // mendeklarasikan variable bernama a yang tipe datanya integer
        System.out.print("Jumlah Kota yang ingin di Inputkan: "); //menginput nama kota dari keyboard menggunakan BufferedReader
        a = Integer.parseInt(kata.readLine()); // mengkonversi variabel a yang bertipe data string menjadi Integer

        String[] Array; // array yang tipe datanya string
        Array = new String[a];
        String temp; // mendeklarasikan variabel temp yang tipe datanya String
        Scanner input = new Scanner(System.in); //menginstansiasi class scanner menjadi variabel yang bernama input

        for (int i = 0; i < a; i++) //
        {
            System.out.print("Kota " + (i + 1) + " adalah: ");
            Array[i] = input.next();
        }

        for (int x = 1; x < a; x++) {
            for (int y = 0; y < x; y++) {
                if (Array[y].compareTo(Array[y + 1]) > 0) //membandingkan dan mengurutkan abjad
                {
                    temp = Array[y];//
                    Array[y] = Array[y + 1];//
                    Array[y + 1] = temp; //
                }
            }
        }
        // output mengurutkan Kota
        System.out.println("");
        System.out.println("Kota berdasarkan urutannya "); // menampilkan hasil nama yang telah terurut

        for (int i = 0; i < a; i++) {
            System.out.println((i + 1) + ". " + Array[i]);
        }
        // output jumlah kota
        System.out.println("Jumlah Kota : " + a);
    }
}
