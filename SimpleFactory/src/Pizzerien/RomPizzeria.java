package Pizzerien;

import Factories.SimpleFactory;

// Client einer SimpleFactory
public class RomPizzeria extends Pizzeria
{
    public RomPizzeria(SimpleFactory factory)
    {
        this.factory = factory;
    }
}
