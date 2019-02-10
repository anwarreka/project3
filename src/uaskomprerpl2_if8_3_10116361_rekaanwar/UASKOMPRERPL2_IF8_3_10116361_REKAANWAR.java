/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaskomprerpl2_if8_3_10116361_rekaanwar;
import java.util.*;
/**
 *
 * @author RSA
 * HARI/TANGGAL : Kamis, 7 Februari 2019

NO SOAL : 3

KELAS : IF8

NIM : 10110269

NAMA : RIZKI ADAM KURNIAWAN

 */

public class UASKOMPRERPL2_IF8_3_10116361_REKAANWAR {

    /**
     * @param args the command line arguments
     */
    static int a;
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner scan = new Scanner(System.in);

        System.out.print ("Masukan Umur Anda :");
        a=scan.nextInt();

        {
            if (a>=17){
                System.out.println ("Status Dewasa : true");
            }else{
                System.out.println("Status Dewasa :false");
            }
        }

    }
}

