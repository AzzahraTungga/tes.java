//Object class 
public class siswa {

    int id;
    String nama;
    double ipk;

    // Counstructor
    public siswa() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    }

    // Counstructor Parameter
    public siswa(int id, String nama, double ipk) {
        // variable = parameter
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;
    }

    // method print
    public void print() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }
}
