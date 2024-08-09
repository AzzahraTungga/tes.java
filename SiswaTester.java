//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //object
        //Class object = new Constructor
        Siswa sasa = new Siswa(); 
        Siswa desti = new Siswa();
        Siswa nimas = new Siswa();
        Siswa talitha = new Siswa();
        Siswa lila = new Siswa();

        sasa.id = 17;
        sasa.nama = "Latisa";
        sasa.ipk = 90;
        desti.id = 7;
        desti.nama = "Destina";
        desti.ipk = 90;
        nimas.id = 30;
        nimas.nama = "Nimas cantik";
        nimas.ipk = 90;
        talitha.id = 34;
        talitha.nama = "Talitha gemas";
        talitha.ipk = 90;
        lila.id = 12;
        lila.nama = "kalila";
        lila.ipk = 90;





        System.out.println("Nama : " + sasa.nama);        
        System.out.println("Absen : " + sasa.id);
        System.out.println("Nilai : "+ sasa.ipk);
        System.out.println("Nama : " + desti.nama);        
        System.out.println("Absen : " + desti.id);
        System.out.println("Nilai : "+ desti.ipk);
        System.out.println("Nama : " + nimas.nama);        
        System.out.println("Absen : " + nimas.id);
        System.out.println("Nilai : "+ nimas.ipk);
        System.out.println("Nama : " + talitha.nama);        
        System.out.println("Absen : " + talitha.id);
        System.out.println("Nilai : "+ talitha.ipk);
        System.out.println("Nama : " + lila.nama);        
        System.out.println("Absen : " + lila.id);
        System.out.println("Nilai : "+ lila.ipk);



    }
}  