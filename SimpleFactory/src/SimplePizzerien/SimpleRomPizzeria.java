package SimplePizzerien;

import SimpleFactories.ISimpleFactory;

// Client einer ISimpleFactory
public class SimpleRomPizzeria extends ISimplePizzeria
{
    public SimpleRomPizzeria(ISimpleFactory factory)
    {
        this.factory = factory;
    }
}
