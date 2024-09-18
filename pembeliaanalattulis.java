import java.util.Scanner;

public class pembeliaanalattulis {
    public static void main(String[] args) {
        int pilihan, jumlah;
        double harga=0, total,temp=0;
        String TambahBeli;

        do{
        Scanner s = new Scanner(System.in);
        System.out.println("List ALat Tulis");
        System.out.println("1.Buku 4000\n2. Pensil 2500\n. Pengahapus 1000\n. Penggaris 2500\n");
        System.out.println("Inputkan Pembeliaan: (1/2/3/3)");
        pilihan = s.nextInt();
        System.out.println("Jumlah Beli");
        jumlah = s.nextInt();

        switch (pilihan) {
            case 1:
                harga=4000;
                break;
            case 2:
                harga=2500;
                break;
            case 3:
                harga=1000;
                break;
            case 4:
                harga=2500;
                break;

            default:
                break;
        }
        total=jumlah*harga;
        temp += total;

        System.out.println("Apakah Beli Lagi? (ya/tidak)");
        TambahBeli = s.next();

    }while (TambahBeli.equalsIgnoreCase("ya"));
        System.out.println("Total yang dibayarkan"+temp);
 
        }
    

    }

