package FactoryMethodPizzerien;

import Pizzen.IPizza;
import Pizzen.noPizza;
import Pizzen.ItalienStyle.*;

// Concrete creator
public class ItalianStyleRomPizzeria extends IFactoryMethodPizzeria
{
    protected IPizza createPizza(String type)
    {
        IPizza pizza;

        if (type.equalsIgnoreCase("cheese"))
            pizza = new ItalianStyleCheesePizza();
        else if (type.equalsIgnoreCase("pepperoni"))
            pizza = new ItalianStylePepperoniPizza();
        else if (type.equalsIgnoreCase("clam"))
            pizza = new ItalianStyleClamPizza();
        else if (type.equalsIgnoreCase("veggie"))
            pizza = new ItalianStyleVeggiePizza();
        else
            pizza = new noPizza();

        return pizza;
    }
}
