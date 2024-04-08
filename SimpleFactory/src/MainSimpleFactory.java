import SimpleFactories.*;
import Pizzen.IPizza;

/*
Simple Factory ist kein echtes Entwurfsmuster.
Die Erstellungsmethode der Factory wird oft statisch deklariert.
 */

public class MainSimpleFactory
{
    public static void main(String[] args)
    {
        SimplePizzeria pizzeria;
        IPizza pizza;

        // Typisch italienische Pizza
        ISimpleFactory factory = new SimpleItalianFactory();
        pizzeria = new SimplePizzeria(factory);

        pizza = pizzeria.orderPizza("cheese");
        System.out.println("### Erste Simple Factory Bestellung: " + pizza.getName() + "\n");

        // Typisch deutsche Pizza
        pizzeria = new SimplePizzeria(new SimpleGermanFactory());

        pizza = pizzeria.orderPizza("würstel");
        System.out.println("### Zweite Simple Factory Bestellung: " + pizza.getName() + "\n");
    }
}
