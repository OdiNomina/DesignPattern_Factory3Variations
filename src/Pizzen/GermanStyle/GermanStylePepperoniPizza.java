package Pizzen.GermanStyle;

import Pizzen.IPizza;

public class GermanStylePepperoniPizza extends IPizza
{
    public GermanStylePepperoniPizza()
    {
        this.setName("Pizza Pepperoni - German Style");
        this.setDough("Teig für dicken Boden");
        this.setSauce("Datteltomatensoße");

        this.addTopping("Milde Peperoni ganz");
        this.addTopping("Scharfe Peperoni in Scheiben");
        this.addTopping("Geriebener Emmentaler");
    }
}
