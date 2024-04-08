import SimpleFactories.ISimpleFactory;
import Pizzen.IPizza;

public class SimplePizzeria
{
    private ISimpleFactory Factory;

    public SimplePizzeria(ISimpleFactory factory)
    {
        this.Factory = factory;
    }

    public IPizza orderPizza(String type)
    {
        IPizza pizza = Factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public ISimpleFactory getFactory()
    {
        return Factory;
    }

    public void setFactory(ISimpleFactory factory)
    {
        this.Factory = factory;
    }
}
