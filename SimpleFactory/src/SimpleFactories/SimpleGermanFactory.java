package SimpleFactories;

import Pizzen.IPizza;
import Pizzen.noPizza;
import Pizzen.GermanStyle.*;

// Nur die konkreten Fabriken beziehen sich auf konkrete Klassen!
public class SimpleGermanFactory implements ISimpleFactory
{
    public IPizza createPizza(String type)
    {
        IPizza pizza = new noPizza();

        if (type.equalsIgnoreCase("hawaii"))
            pizza = new GermanStyleHawaiiPizza();
        else if (type.equalsIgnoreCase("pepperoni"))
            pizza = new GermanStylePepperoniPizza();
        else if (type.equalsIgnoreCase("bolognese"))
            pizza = new GermanStyleBolognesePizza();
        else if (type.equalsIgnoreCase("würstel"))
            pizza = new GermanStyleWuerstelPizza();

        return pizza;
    }
}
