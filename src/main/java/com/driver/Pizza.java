package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int baseprice;
    private int cheeseprice;
    private int toppingsprice;
    private int bagprice;

    private boolean ischeeseused;
    private boolean istoppingused;
    private boolean istakeawaydone;// my won var
    private boolean isbillgenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            baseprice=300;
            price=300;
            toppingsprice=70;
        }
        else{
            baseprice=400;
            price=400;
            toppingsprice=120;
        }
        ischeeseused=false;
        istoppingused=false;
        istakeawaydone=false;
        isbillgenerated=false;
        cheeseprice=80;
        bagprice=20;
        bill= "Base Price Of The Pizza: " + baseprice ;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(ischeeseused){
            return;
        }
        price+=cheeseprice;
       ischeeseused=true;
    }

    public void addExtraToppings(){
        // your code goes here

        if(istoppingused){
            return;
        }
        if(isVeg){
            price+=toppingsprice;
        }
        else{
            price+=toppingsprice;
        }
        istoppingused=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(istakeawaydone){
            return;
        }
        price+=bagprice;
        istakeawaydone=true;
    }

    public String getBill(){
        // your code goes here
        if(!isbillgenerated){
            isbillgenerated=true;
            if(ischeeseused){
                bill+= "\nExtra Cheese Added: " + cheeseprice ;
            }
            if(istoppingused){
                bill += "\nExtra Toppings Added: " + toppingsprice;
            }
            if(istakeawaydone){
                bill+= "\nPaperbag Added: "  + bagprice;
            }
            bill+= "\nTotal Price: " + price ;

        }
        return this.bill;
    }
}
