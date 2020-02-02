package com.epam;

import java.util.Scanner;

public class NewYearsGift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of chocolates to add in gift");
//        sc.nextLine();
        int n1 = sc.nextInt();
        System.out.println("Enter total number of candies to add in gift");
        int n2 = sc.nextInt();
        System.out.println("The chocolates that are available are: Snikker,Perk, Dairy Milk, Five Star ");
        Sweet chocolates[] = new Chocolate[n1];
        Sweet candy[] = new Candy[n2];
        double totalweight=0;
        double chocolateweight[] = new double[n1];
        double candyweight[] = new double[n2];
        for(int i=0;i<n1;i++)
        {
            System.out.println("Enter chocolate "+(i+1)+" name to add in gift");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter chocolate "+(i+1)+" quantity");
            int quantity = sc.nextInt();
            chocolates[i] = new Chocolate(name,quantity);
            chocolateweight[i] = chocolates[i].weight*quantity;
            totalweight+=chocolateweight[i];
         }
        System.out.println("The candiess that are available are: Eclairs,Alpenliebe,Coconut candy,Mango Bite");
        for(int i=0;i<n2;i++)
        {
            System.out.println("Enter candy "+(i+1)+" name to add in gift");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter candy "+(i+1)+" quantity");
            int quantity = sc.nextInt();
            candy[i] = new Candy(name,quantity);
            candyweight[i] = candy[i].weight*quantity;
            totalweight+=candyweight[i];
        }
        System.out.print("The chocolates added in the gift are: ");
        for(int i=0;i<chocolates.length;i++)
        {
            System.out.print(chocolates[i].name+" ");
        }
        System.out.println();
        System.out.print("The candies added in the gift are: ");
        for(int i=0;i<candy.length;i++)
        {
            System.out.print(candy[i].name+" ");
        }
        System.out.println();
        System.out.println("Total weight of the Gift is "+totalweight+"g");

        System.out.println("Press 1 to sort the chocolates by it total weight or press 0 not sort");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1 :
                for (int i=0;i<n1;i++)
                {
                    for (int j=i+1;j<n1;j++)
                    {
                        if(chocolateweight[i]>chocolateweight[j])
                        {
                            Sweet temp = chocolates[i];
                            chocolates[i] = chocolates[j];
                            chocolates[j] = temp;
                        }
                    }
                }
                System.out.println("The chocolates in the gift after sorting are");
                for(int i=0;i<n1;i++)
                {
                    System.out.print(chocolates[i].name+", ");
                }
                System.out.println();
        }

        System.out.println("Enter 1 for searching a candy in the Gift");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter the candy name to search in the gift");
                sc.nextLine();
                String cname = sc.nextLine();
                for(int i=0;i<candy.length;i++)
                {
                    if(candy[i].name.equalsIgnoreCase(cname))
                    {
                        System.out.println("Candy "+cname+" is present in the gift");
                        break;
                    }
                    else
                    {
                        System.out.println("Candy "+cname+" is not present in the Gift List");
                        break;
                    }
                }
        }
    }
}
