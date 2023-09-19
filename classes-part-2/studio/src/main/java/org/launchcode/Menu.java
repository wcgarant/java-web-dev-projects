package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public ArrayList<MenuItem> addMenuItem(MenuItem item) {
        this.items.add(item);
        return this.items;
    }

    public void printMenu(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getDescription());
        }
    }
//    @Override
//    public String toString() {
//        return "Menu{" +
//                "lastUpdated=" + lastUpdated +
//                ", items=" + items +
//                '}';
//    }
}


