package com.epam;

public class Chocolate extends Sweet {

    public Chocolate(String name,int quantity)
    {
        super(name,quantity);
        if(name.equalsIgnoreCase("Snikker"))
        {
            this.weight = 20;
        }
        else if(name.equalsIgnoreCase("Perk"))
        {
            this.weight = 10;
        }
        else if(name.equalsIgnoreCase("Dairy Milk"))
        {
            this.weight = 25;
        }
        else if(name.equalsIgnoreCase("Five Star"))
        {
            this.weight = 15;
        }
    }

}
