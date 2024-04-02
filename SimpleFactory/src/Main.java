import Factories.*;
import Pizzen.Pizza;
import Pizzerien.*;

public class Main
{
    public static void main(String[] args)
    {
        // Typisch italienische Pizza
        SimpleFactory factory = new ItalianFactory();
        Pizzeria pizzeria = new RomPizzeria(factory);

        Pizza pizza = pizzeria.orderPizza("cheese");
        System.out.println(pizza);
        System.out.println();

        // Typisch deutsche Pizza
        factory = new GermanFactory();
        pizzeria = new MunichPizzeria(factory);

        pizza = pizzeria.orderPizza("würstel");
        System.out.println(pizza);
    }
}
