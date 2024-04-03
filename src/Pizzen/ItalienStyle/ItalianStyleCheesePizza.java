package Pizzen.ItalienStyle;

import Pizzen.IPizza;

// Concrete product
public class ItalianStyleCheesePizza extends IPizza
{
    public ItalianStyleCheesePizza()
    {
        this.setName("Pizza vier Käsesorten - Italien Style");
        this.setDough("Teig für dünnen Boden");
        this.setSauce("Marinarasoße");

        this.addTopping("Mozarella in Scheiben");
        this.addTopping("Parmesan gehobelt");
        this.addTopping("Ziegencamembert in Scheiben");
        this.addTopping("Pecorino gehobelt");
    }
}
