package persewaan; // nama folder tempat penyimpanaan
//subclass
public class CD extends product {
    String artist;
    int totalsong;
    String label;
    public CD() {
        number = 10;
        nama = "Selamat Siang";
        quantity = 0;
        price = 0.0;
        artist = "Zea"; 
        totalsong = 0;
        label = "Sony Music";
    }
    public void print () {
        System.out.println("number: "+ number);
        System.out.println("name: "+ nama);
        System.out.println("quantity: + quantity");
        System.out.println("price: "+ price);
        System.out.println("artist: "+ artist);
        System.out.println("totalsong: "+ totalsong);
        System.out.println("label: "+ label);
    }
}
