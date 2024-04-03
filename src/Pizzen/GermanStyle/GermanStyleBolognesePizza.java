package Pizzen.GermanStyle;

import Pizzen.IPizza;

public class GermanStyleBolognesePizza extends IPizza
{
    public GermanStyleBolognesePizza()
    {
        this.setName("Pizza Bolognese - German Style");
        this.setDough("Teig für dicken Boden");
        this.setSauce("Bolognesesoße");

        this.addTopping("Frische Champions in Scheiben");
        this.addTopping("Geriebener Parmesan");
    }
}
