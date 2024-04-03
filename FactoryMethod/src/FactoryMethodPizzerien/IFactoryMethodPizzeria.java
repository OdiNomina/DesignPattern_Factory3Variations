package FactoryMethodPizzerien;

import Pizzen.IPizza;

// Abstract creator
public abstract class IFactoryMethodPizzeria
{
    // Fabrikmethode => verkapselt Objekterstellung in Subklassen => kein Bezug zu konkreten Klassen.
    protected abstract IPizza createPizza(String type);

    // Client der Fabrikmethode
    public IPizza orderPizza(String type)
    {
        IPizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
