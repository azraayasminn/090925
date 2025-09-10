public class Instrumen {
    private String name;
    private double price;

    public Instrumen(){
        name = "Guittar";
        price = 175000;
    }
    public String getname(){
        return name;
    }
    public double getprice(){
        return price;
    }
    public void setname(String n){
        name = n;
    }
    public void setprice(double p){
        price = p;
    }


    public void print(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }

    public Instrumen(String n, double p){
        name = n;
        price = p;  
    }
    
}
