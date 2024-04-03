package Pizzen.ItalienStyle;

import Pizzen.IPizza;

public class ItalianStyleVeggiePizza extends IPizza
{
    public ItalianStyleVeggiePizza()
    {
        this.setName("Pizza Vegetarisch - Italien Style");
        this.setDough("Teig für dünnen Boden");
        this.setSauce("Marinarasoße");

        this.addTopping("Pepperoni scharf in Scheiben");
        this.addTopping("Artischoken");
        this.addTopping("Oliven");
        this.addTopping("Paprika");
        this.addTopping("Mozarella in Scheiben");
    }
}
