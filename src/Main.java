import MenuBuilder.*;

public class Main {
    public static void main(String args[]) {
        MenuItemFactory factory = new MenuItemFactory();
        Menu menu = factory.getMenu("FreeText", "OutsideMenu", "Main Menu");
        Menu insideMenu = factory.getMenu("Numerical", "Secondary Menu", "Whats up?");
        MenuItem returnItem = factory.getItem("Return", "Return to Main Menu", menu);
        MenuItem exitItem = factory.getItem("Exit", "Exit", insideMenu);
        MenuItem printItem = new PrintFunction(insideMenu,"Print yed", "Wallak");
        insideMenu.addToMenu(printItem);
        insideMenu.addToMenu(returnItem);
        insideMenu.addToMenu(exitItem);
        menu.addToMenu(insideMenu);
        menu.ExecuteAction();
    }
}
