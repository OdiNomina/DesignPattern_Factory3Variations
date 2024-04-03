import FactoryMethodPizzerien.*;
import Pizzen.IPizza;

/*
Das Factory Method Muster definiert eine Schnittstelle zur Objekterstellung,
lässt aber die Subklassen entscheiden, welche Klassen instanziiert werden.
Factory Method ermöglicht einer Klasse, die Instanziierung in Subklassen zu verlagern.
 */

public class MainFactoryMethod
{
    public static void main(String[] args)
    {
        IFactoryMethodPizzeria pizzeria;
        IPizza pizza;

        // Typisch italienische Pizza
        pizzeria = new ItalianStyleRomPizzeria();
        pizza = pizzeria.orderPizza("cheese");
        System.out.println("### Erste Factory Method Bestellung: " + pizza.getName() + "\n");

        // Typisch deutsche Pizza
        pizzeria = new GermanStyleMunichPizzeria();
        pizza = pizzeria.orderPizza("würstel");
        System.out.println("### Zweite Factory Method Bestellung: " + pizza.getName() + "\n");
    }
}
