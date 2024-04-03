package Pizzen;

import java.util.ArrayList;
import java.util.List;

// Abstract product
public abstract class IPizza
{
    private String Name;
    private String Dough;
    private String Sauce;
    private List<String> Toppings = new ArrayList<>();

    public void prepare()
    {
        System.out.println("# Vorbereitungen für: " + Name);
        System.out.println("Knete Teig... " + Dough);
        System.out.println("Füge Soße hinzu... " + Sauce);
        System.out.print("Füge Beläge hinzu:");
        for(String t : Toppings)
            System.out.print(" - " + t);
        System.out.println();
    }

    public void bake()
    {
        System.out.println("# Backen (Standard): Steinofen, 220 °C, 5 min.");
    }

    public void cut()
    {
        System.out.println("# Schneiden (Standard): Diagonal in 12 Stücke.");
    }

    public void box()
    {
        System.out.println("# Verpacken (Standard): Original SimpleFactory Schachteln.");
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }
    public String getDough()
    {
        return Dough;
    }

    public void setDough(String dough)
    {
        Dough = dough;
    }

    public String getSauce()
    {
        return Sauce;
    }

    public void setSauce(String sauce)
    {
        Sauce = sauce;
    }

    public List<String> getToppings()
    {
        return Toppings;
    }

    public void addTopping(String topping)
    {
        Toppings.add(topping);
    }
}
