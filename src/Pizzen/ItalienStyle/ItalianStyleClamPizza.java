package Pizzen.ItalienStyle;

import Pizzen.IPizza;

public class ItalianStyleClamPizza extends IPizza
{
    public ItalianStyleClamPizza()
    {
        this.setName("Pizza Venusmuscheln - Italien Style");
        this.setDough("Teig für dünnen Boden");
        this.setSauce("Marinarasoße");

        this.addTopping("Venusmuscheln");
        this.addTopping("Parmesan gehobelt");
    }
}
