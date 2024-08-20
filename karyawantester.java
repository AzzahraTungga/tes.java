public class karyawantester {
    public static void main(String[] args) {
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

    }
}
