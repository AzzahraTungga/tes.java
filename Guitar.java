package ObjectClass;

public class Guitar extends StringInstruments{
    boolean isElectric;

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Guitar() {
        isElectric = true;
    }

    public Guitar(String name, double price, int numStrings, boolean isElectric) {
        super(numStrings, name, price);
        this.isElectric = isElectric;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Gitarnya: "+isElectric);
    }

}
    
    

