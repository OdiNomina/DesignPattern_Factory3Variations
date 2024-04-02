package Pizzerien;

import Factories.SimpleFactory;

// Client einer SimpleFactory
public class MunichPizzeria extends Pizzeria
{
    public MunichPizzeria(SimpleFactory factory)
    {
        this.factory = factory;
    }
}
