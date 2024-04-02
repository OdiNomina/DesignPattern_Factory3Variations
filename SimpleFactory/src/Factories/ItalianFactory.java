package Factories;

import Pizzen.*;
import Pizzen.ItalienStyle.*;

// Nur die konkreten Fabriken beziehen sich auf konkrete Klassen!
public class ItalianFactory implements SimpleFactory
{
    public Pizza createPizza(String type)
    {
        Pizza pizza = new noPizza();

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
