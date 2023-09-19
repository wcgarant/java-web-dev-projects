import java.util.ArrayList;

public class Menu {
    private final ArrayList<MenuItem> menu;

    public Menu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public ArrayList<MenuItem> addMenuItem(MenuItem item) {
        this.menu.add(item);
        return this.menu;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menu=" + menu +
                '}';
    }
//    static void removeMenuItem(MenuItem item) {
//        menu.remove(item);
//    }
}
