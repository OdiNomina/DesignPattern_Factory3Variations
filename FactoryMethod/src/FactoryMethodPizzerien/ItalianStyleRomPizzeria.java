package FactoryMethodPizzerien;

import Pizzen.IPizza;
import Pizzen.noPizza;
import Pizzen.ItalienStyle.*;

// Concrete creator
public class ItalianStyleRomPizzeria extends IFactoryMethodPizzeria
{
    public IPizza createPizza(String type)
    {
        IPizza pizza = new noPizza();

        if (type.equalsIgnoreCase("cheese"))
            pizza = new ItalianStyleCheesePizza();
        else if (type.equalsIgnoreCase("pepperoni"))
            pizza = new ItalianStylePepperoniPizza();
        else if (type.equalsIgnoreCase("clam"))
            pizza = new ItalianStyleClamPizza();
        else if (type.equalsIgnoreCase("veggie"))
            pizza = new ItalianStyleVeggiePizza();

        return pizza;
    }
}
