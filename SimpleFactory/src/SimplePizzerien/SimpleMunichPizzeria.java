package SimplePizzerien;

import SimpleFactories.ISimpleFactory;

// Client einer ISimpleFactory
public class SimpleMunichPizzeria extends ISimplePizzeria
{
    public SimpleMunichPizzeria(ISimpleFactory factory)
    {
        this.factory = factory;
    }
}
