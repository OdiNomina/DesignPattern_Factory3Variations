package Pizzen;

public abstract class IPizza
{
    public String Description;
    public abstract void prepare();
    public void bake()
    {
        System.out.println("Backen (Standard): Steinofen, 220 °C, 5 min.");
    }
    public void cut()
    {
        System.out.println("Schneiden (Standard): Diagonal in 12 Stücke.");
    }
    public void box()
    {
        System.out.println("Verpacken (Standard): Original SimpleFactory Schachteln.");
    }

    @Override
    public String toString()
    {
        return "Beschreibung: " + Description;
    }

    public String getDescription()
    {
        return Description;
    }

    public void setDescription(String description)
    {
        Description = description;
    }
}
