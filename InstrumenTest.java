public class InstrumenTest {
    public static void main(String[] args) {
        Instrumen guitar = new Instrumen();
        Instrumen piano = new Instrumen ("Piano", 160000);
        Instrumen drum = new Instrumen("Drum", 500000);


        guitar.print();
        piano.print();
        drum.print();
    }
}
