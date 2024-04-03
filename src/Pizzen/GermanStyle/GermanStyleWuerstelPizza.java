package Pizzen.GermanStyle;

import Pizzen.IPizza;

public class GermanStyleWuerstelPizza extends IPizza
{
    public GermanStyleWuerstelPizza()
    {
        this.setName("Pizza Würstel - German Style");
        this.setDough("Teig für dicken Boden");
        this.setSauce("Datteltomatensoße");

        this.addTopping("Wiener-Würstchen in Scheiben");
        this.addTopping("Geriebener Emmentaler");
    }
}
