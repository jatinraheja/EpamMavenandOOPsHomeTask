package com.epam;

public class Candy extends Sweet{

    public Candy(String name,int quantity)
    {
        super(name,quantity);
        if(name.equalsIgnoreCase("Alpenliebe"))
        {
            this.weight = 3.5;
        }
        else if(name.equalsIgnoreCase("Coconut Candy"))
        {
            this.weight = 2;
        }
        else if(name.equalsIgnoreCase("Eclairs"))
        {
            this.weight = 4;
        }
        else if(name.equalsIgnoreCase("Mango Bite"))
        {
            this.weight = 3;
        }
        this.quantity = quantity;
    }
}
