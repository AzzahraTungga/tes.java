//Driver Class
import java.util.Scanner;

public class karyawantester {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Inputkan nama:");
        String nama = input.nextLine();
        System.out.println("Inputkan alamat:");
        String unit = input.nextLine();
        System.out.println("Inputkan unit:");
        String alamat = input.nextLine();
        System.out.println("Inputkan ID:");
        int id = input.nextInt();

        karyawan nimas = new karyawan(id, nama, unit, alamat);
        nimas.print();
        input.close();

        //object
        //Class object = new constructor

        karyawan Tia = new karyawan( 123, "Tia","TU","Malang");
        karyawan Alex = new karyawan(87, "Alex", "Kurikulum", "surabaya");
        karyawan Rudi = new karyawan(9, "Rudi", "Kesiswaan", "jember");
        karyawan Suna = new karyawan(7, "suna", "BK", "Mojokerto"); 
        karyawan Yasmin = new karyawan(9,"Yasmin", "Sapras", "Sidoarjo");

        Tia.print();
        Alex.print();
        Rudi.print();
        Suna.print();
input.close();
    }
}
