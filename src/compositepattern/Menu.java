/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Rafa
 */
public class Menu extends MenuComponent{
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
     
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponents.get(i);
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void print(){
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent =
            (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
