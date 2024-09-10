package persewaan;
//subclass
public class DVD extends product {
    private int leght;
    private String rating;
    private String studio;

    public DVD() {
        number = 10;
        nama = "Zea cecan";
        quantity = 0;
        price = 0.0;
        leght = 0;
        rating = "All age";
        studio = "Zea kiyowok";
    }
public void DVDprint (){
    System.out.println("number: "+ number);
    System.out.println("name: "+ nama);
    System.out.println("quantity: + quantity");
    System.out.println("price: "+ price);
    System.out.println("rating: "+ rating);
    System.out.println("studio: "+ studio);
}
        
        }


