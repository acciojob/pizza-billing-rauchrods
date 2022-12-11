package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheeseused;
    private boolean toppingused;
    private boolean takeawaydone;// my won var

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
          bill="";
        if(isVeg){
            price+=300;
            bill+="Base Price Of The Pizza:300" ;
        }
        else{
            price+=400;
            bill+="Base Price Of The Pizza:400" ;
        }
        cheeseused=false;
        toppingused=false;
        takeawaydone=false;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(cheeseused){
            return;
        }
        price+=80;
       bill+= "\nExtra Cheese Added:80" ;
       cheeseused=true;
    }

    public void addExtraToppings(){
        // your code goes here

        if(toppingused){
            return;
        }
        if(isVeg){
            price+=70;
            bill += "\nExtra Toppings Added:70" ;
        }
        else{
            price+=120;
            bill += "\nExtra Toppings Added:120" ;
        }
        toppingused=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(takeawaydone){
            return;
        }
        price+=20;
        bill+= "\nPaper bag Price:20" ;
        takeawaydone=true;

    }

    public String getBill(){
        // your code goes here
        bill+= "\nTotal Price:" + price ;
        return this.bill;
    }
}
