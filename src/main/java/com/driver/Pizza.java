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


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
          bill="";
        if(isVeg){
            baseprice=300;
            price+=300;
        }
        else{
            baseprice=400;
            price+=400;
        }
        ischeeseused=false;
        istoppingused=false;
        istakeawaydone=false;
        cheeseprice=0;
        toppingsprice=0;
        bagprice=0;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(ischeeseused){
            return;
        }
        cheeseprice=80;
        price+=80;
       ischeeseused=true;
    }

    public void addExtraToppings(){
        // your code goes here

        if(istoppingused){
            return;
        }
        if(isVeg){
            toppingsprice=70;
            price+=70;
        }
        else{
            toppingsprice=120;
            price+=120;
        }
        istoppingused=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(istakeawaydone){
            return;
        }
        bagprice=20;
        price+=20;
        istakeawaydone=true;

    }

    public String getBill(){
        // your code goes here
        bill+="Base Price Of The Pizza: " + baseprice ;
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
        return this.bill;
    }
}
