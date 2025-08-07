package TesLks;

import java.util.Scanner;

public class Suhu {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Masukkan suhu Celcius : ");
        int C=scan.nextInt();
        double F = C * 1.40 + 32;
        System.out.println("Hasil konversi ke Farenheit : " + F);
    }
}