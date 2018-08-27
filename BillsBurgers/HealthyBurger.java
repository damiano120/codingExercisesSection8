package BillsBurgers;

public class HealthyBurger extends Hamburger {

    private String healthyAddition1;
    private double healthyAddition1Price;
    private String healthyAddition2;
    private double healthyAddition2Price;

    public HealthyBurger(String meat, double price) {
        super("Bealthy", meat, price, "Brown");
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyAddition1=name;
        this.healthyAddition1Price=price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyAddition2=name;
        this.healthyAddition2Price=price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice=super.itemizeHamburger();
        if (this.healthyAddition1!=null) {
            hamburgerPrice += this.healthyAddition1Price;
            System.out.println("Added " + this.healthyAddition1 + " extra price " + this.healthyAddition1Price);
        }
        if (this.healthyAddition2!=null) {
            hamburgerPrice += this.healthyAddition2Price;
            System.out.println("Added " + this.healthyAddition2 + " extra price " + this.healthyAddition2Price);
        }
    return hamburgerPrice;
    }
}
