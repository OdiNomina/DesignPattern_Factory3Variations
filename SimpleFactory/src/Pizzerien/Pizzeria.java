package Pizzerien;

import Pizzen.*;
import Factories.*;

public abstract class Pizzeria
{
    SimpleFactory factory;

    public Pizza orderPizza(String type)
    {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
