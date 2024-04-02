package Factories;

import Pizzen.*;
import Pizzen.GermanStyle.*;

// Nur die konkreten Fabriken beziehen sich auf konkrete Klassen!
public class GermanFactory implements SimpleFactory
{
    public Pizza createPizza(String type)
    {
        Pizza pizza = new noPizza();

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
