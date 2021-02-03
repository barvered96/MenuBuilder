import MenuBuilder.MenuItems.ActionItems.ExitActionItem;
import MenuBuilder.MenuItems.ActionItems.PrintFunction;
import MenuBuilder.MenuItems.ActionItems.ReturnActionItem;
import MenuBuilder.MenuItems.Menus.FreeTextMenu;
import MenuBuilder.MenuItems.Menus.Interface.Menu;
import MenuBuilder.MenuItems.Interface.MenuItem;
import MenuBuilder.MenuItems.Menus.NumericalMenu;

public class Main {
    public static void main(String args[]) {
        Menu menu = new FreeTextMenu("OutsideMenu", "Main Menu");
        Menu insideMenu = new NumericalMenu("Secondary Menu", "Whats up?");
        MenuItem returnItem = new ReturnActionItem( menu, "Return to Main Menu");
        MenuItem exitItem = new ExitActionItem( "Exit");
        MenuItem printItem = new PrintFunction(insideMenu,"Print yed", "Wallak");
        insideMenu.addToMenu(printItem);
        insideMenu.addToMenu(returnItem);
        insideMenu.addToMenu(exitItem);
        menu.addToMenu(insideMenu);
        menu.ExecuteAction();
    }
}
