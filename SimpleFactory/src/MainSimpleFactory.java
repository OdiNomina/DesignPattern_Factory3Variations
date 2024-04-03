import SimpleFactories.*;
import Pizzen.IPizza;
import SimplePizzerien.*;

public class MainSimpleFactory
{
    public static void main(String[] args)
    {
        // Typisch italienische Pizza
        ISimpleFactory factory = new SimpleItalianFactory();
        ISimplePizzeria pizzeria = new SimpleRomPizzeria(factory);

        IPizza pizza = pizzeria.orderPizza("cheese");
        System.out.println(pizza);
        System.out.println();

        // Typisch deutsche Pizza
        factory = new SimpleGermanFactory();
        pizzeria = new SimpleMunichPizzeria(factory);

        pizza = pizzeria.orderPizza("würstel");
        System.out.println(pizza);
    }
}
