package Pizzen.GermanStyle;

import Pizzen.IPizza;

public class GermanStyleHawaiiPizza extends IPizza
{
    public GermanStyleHawaiiPizza()
    {
        this.setName("Pizza Hawaii - German Style");
        this.setDough("Teig für dicken Boden");
        this.setSauce("Datteltomatensoße");

        this.addTopping("Ananas in Stücken");
        this.addTopping("Schinken");
        this.addTopping("Geriebener Emmentaler");
    }
}
