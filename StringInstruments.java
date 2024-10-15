package ObjectClass;

public class StringInstruments extends Instruments{
    private int numStrings;

    public int getNumStrings() {
        return this.numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
    public StringInstruments(){
        super();
        numStrings = 0;
    }
    public StringInstruments(int numStrings, String name, double price) {
        super(name, price);
        this.numStrings = numStrings;
    }
    public void print (){
        super.print();

        System.out.println("numString: "+ numStrings);

    }


    
    
}
