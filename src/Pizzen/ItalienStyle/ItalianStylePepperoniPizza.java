package Pizzen.ItalienStyle;

import Pizzen.IPizza;

public class ItalianStylePepperoniPizza extends IPizza
{
    public ItalianStylePepperoniPizza()
    {
        this.setName("Pizza Pepperoni - Italien Style");
        this.setDough("Teig für dünnen Boden");
        this.setSauce("Marinarasoße");

        this.addTopping("Pepperoni scharf in Scheiben");
        this.addTopping("Salami");
        this.addTopping("Mozarella in Scheiben");
    }
}
