package SimplePizzerien;

import SimpleFactories.ISimpleFactory;
import Pizzen.IPizza;

public abstract class ISimplePizzeria
{
    ISimpleFactory factory;

    public IPizza orderPizza(String type)
    {
        IPizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
