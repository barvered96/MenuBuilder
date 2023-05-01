package MenuBuilder.Displayer;

import MenuBuilder.Displayer.Interface.MenuDisplayer;
import MenuBuilder.MenuItems.Interface.MenuItem;

import java.util.Map;

public class NumericalMenuDisplayer implements MenuDisplayer {
    @Override
    public void print(String title, Map menu) {
        Map<Integer, MenuItem> menuCast = (Map<Integer, MenuItem>) menu;
        System.out.println(title);
        System.out.println("-------------------------\n");
        for (Map.Entry<Integer, MenuItem> item: menuCast.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue().getDisplayName());
        }
    }
}
