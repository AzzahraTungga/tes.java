package ObjectClass;

import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("pilih gitar atau piano");
        String pilihan = in.nextLine();

        if(pilihan.equals("gitar")){
            System.out.println("inputkan nama gitar: ");
            String name = in.nextLine();
            System.out.println("inputkan harga");
            double price = in.nextDouble();
            System.out.println("inputkan jumlah senar");
            int numString = in.nextInt();
            System.out.println("Gitar Elektrik/tidak ");
            boolean isElectric = in.nextBoolean();

            Guitar gitar1 = new Guitar(name, price, numString, isElectric);
            gitar1.print();

        } else if(pilihan.equals("piano")) {
            System.out.println("inputkan nama piano: ");
            String name = in.nextLine();
            System.out.println("inputkan harga");
            double price = in.nextDouble();
            in.nextLine();
            System.out.println("inputkan jenis piano");
            String pianoType = in.nextLine();

            Piano piano2 = new Piano (pianoType, name, price);
            piano2.print();
        }
    }
}
