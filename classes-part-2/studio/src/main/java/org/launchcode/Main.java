package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item = new MenuItem(3.5, "Cheesy Potatoes", "Dinner", true);
        Date today = new Date();
        ArrayList<MenuItem> items = new ArrayList<>();
        Menu menu1 = new Menu(today, items);
        menu1.addMenuItem(item);
        menu1.printMenu();
    }
}
