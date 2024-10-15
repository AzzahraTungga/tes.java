package ObjectClass;

public class Piano extends Instruments {
    private String pianoType;

    public String getPianoType() {
        return this.pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }

  public Piano() {
    super();
    pianoType = "kosong";
  }
  public Piano(String pianoType, String name, double price) {
    super(name, price);
    this.pianoType = pianoType;
  }

    public void print() {
        super.print();
        System.out.println("pianoType: " + pianoType);
    }
}
