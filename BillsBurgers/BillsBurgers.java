package BillsBurgers;

    // Program utworzony w celu ćwiczenia polimorfizmu i dziedziczenia
    // Program uwzględnia 3 typy burgerów, po dodaniu różnych dodatków zmienia się cena burgera

public class BillsBurgers {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sausage", 3.88, "White");
        hamburger.addAddition1("tomato", 0.72);
        hamburger.addAddition2("lettuce", 0.44);
        hamburger.addAddition3("cheese", 1.54);
        double hamburgerPrice = hamburger.itemizeHamburger();
        System.out.println("Total Burger price is " + hamburgerPrice);
        System.out.println();

        HealthyBurger healthyBurger=new HealthyBurger("Beef",4.85);
        healthyBurger.addHealthyAddition1("egg", 0.54);
        healthyBurger.addHealthyAddition2("bacon", 1.10);
        double heathyBurgerPrice=healthyBurger.itemizeHamburger();
        System.out.println("Total Burger price is " + heathyBurgerPrice);
        System.out.println();

        DeluxBurger deluxBurger=new DeluxBurger();
        double deluxBurgerPrice=deluxBurger.itemizeHamburger();
        System.out.println("Total Burger price is " + deluxBurgerPrice);

    }
}
