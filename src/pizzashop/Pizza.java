/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.ArrayList;

/**
 * A class that represents a basic pizza
 * @author dancye
 */
public class Pizza 
{
    private int bakeTemp;//temp to bake at
    private ArrayList<String> ingredients = new ArrayList();
   
    public Pizza(){
       this(100);
    }
    
    public Pizza(int temp){
        bakeTemp = temp;
    }

    public int getBakeTemp() {
        return bakeTemp;
    }

    public void setBakeTemp(int bakeTemp) {
        this.bakeTemp = bakeTemp;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
   
    
    public void bake()
    {
        //do some baking here, code not implemented yet
        //not necessary for the review
    }
    /**
     *  A method to add toppings to the ingredients
     * list
     * @param topping 
     */
    public void addTopping(String topping)
    {
        ingredients.add(topping);
    }
}
