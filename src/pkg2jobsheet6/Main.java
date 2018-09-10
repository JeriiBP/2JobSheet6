/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2jobsheet6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String identitas = "Alzerivan B P / X RPL 6 / 07";
        tampilJudul(identitas);

        System.out.println("5 jenis pecahan uang : "
                + "\n100"
                + "\n500"
                + "\n1000"
                + "\n2000"
                + "\n5000");

        System.out.print("Masukkan jumlah uang : ");
        int uang = masuk.nextInt();

        Proses(uang);

    }

    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : " + identitas);
    }

    private static void Proses(int uang) {
        int uang1, uang2, uang3, uang4, uang5;
        int sisa1, sisa2, sisa3, sisa4, sisa5;

        uang1 = uang / 5000;
        sisa1 = uang % 5000;

        uang2 = sisa1 / 2000;
        sisa2 = sisa1 % 2000;

        uang3 = sisa2 / 1000;
        sisa3 = sisa2 % 1000;

        uang4 = sisa3 / 500;
        sisa4 = sisa3 % 500;

        uang5 = sisa4 / 100;
        sisa5 = sisa4 % 100;

        System.out.println("Kombinasi pecahan uang minimal :");
        System.out.println("5000 = " + uang1);
        System.out.println("2000 = " + uang2);
        System.out.println("1000 = " + uang3);
        System.out.println("500 = " + uang4);
        System.out.println("100 = " + uang5);
    }

}
