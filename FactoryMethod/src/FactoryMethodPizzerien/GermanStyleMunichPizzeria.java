package FactoryMethodPizzerien;

import Pizzen.GermanStyle.*;
import Pizzen.IPizza;
import Pizzen.noPizza;

// Concrete creator
public class GermanStyleMunichPizzeria extends IFactoryMethodPizzeria
{
    protected IPizza createPizza(String type)
    {
        IPizza pizza;

        if (type.equalsIgnoreCase("hawaii"))
            pizza = new GermanStyleHawaiiPizza();
        else if (type.equalsIgnoreCase("pepperoni"))
            pizza = new GermanStylePepperoniPizza();
        else if (type.equalsIgnoreCase("bolognese"))
            pizza = new GermanStyleBolognesePizza();
        else if (type.equalsIgnoreCase("würstel"))
            pizza = new GermanStyleWuerstelPizza();
        else
            pizza = new noPizza();

        return pizza;
    }
}
