package SimpleFactories;

import Pizzen.IPizza;

public interface ISimpleFactory
{
    public IPizza createPizza(String type);
}
