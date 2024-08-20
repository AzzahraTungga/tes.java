import java.util.Scanner;

public class GajiKaryawan {
    
    public static void main(String[] args) {
        double jumlahjamkerja, tarifperjamdaripengguna, potonganpajak, totalgaji;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah jam kerja: ");
        jumlahjamkerja = input.nextDouble();
        System.out.println("Masukkan tarif perjam pengguna: ");
        tarifperjamdaripengguna = input.nextDouble();
        System.out.println("Masukkan potongan pajak");
        potonganpajak = input.nextDouble();       
        System.out.println("Masukkan total pajak5: ");
        totalgaji = input.nextDouble();

        totalgaji= jumlahjamkerja*tarifperjamdaripengguna;
        potonganpajak=(potonganpajak/100)*totalgaji;
        totalgaji=totalgaji-potonganpajak;
        System.out.println("Total gaji:"+totalgaji);


    }
}
