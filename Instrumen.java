public class Instrumen {
    private String name;
    private double price;

    public Instrumen(){
        name = "Guittar";
        price = 175000;
    }
    public void print(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}
