import SimpleFactories.*;
import Pizzen.IPizza;
import SimplePizzerien.*;

/*
Simple Factory ist kein echtes Entwurfsmuster.
Die Erstellungsmethode der Factory wird oft statisch deklariert.
 */

public class MainSimpleFactory
{
    public static void main(String[] args)
    {
        ISimpleFactory factory;
        ISimplePizzeria pizzeria;
        IPizza pizza;

        // Typisch italienische Pizza
        factory = new SimpleItalianFactory();
        pizzeria = new SimpleRomPizzeria(factory);

        pizza = pizzeria.orderPizza("cheese");
        System.out.println("### Erste Simple Factory Bestellung: " + pizza.getName() + "\n");

        // Typisch deutsche Pizza
        factory = new SimpleGermanFactory();
        pizzeria = new SimpleMunichPizzeria(factory);

        pizza = pizzeria.orderPizza("würstel");
        System.out.println("### Zweite Simple Factory Bestellung: " + pizza.getName() + "\n");
    }
}
