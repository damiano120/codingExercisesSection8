package BillsBurgers;

public class DeluxBurger extends Hamburger {

public DeluxBurger(){
    super("Delux", "Chicken", 8.54, "Brown");
    super.addAddition1("Chips", 2.88);
    super.addAddition2("drink", 3.12);
}
}
