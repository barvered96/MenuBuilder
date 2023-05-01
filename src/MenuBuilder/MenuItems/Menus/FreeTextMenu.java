package MenuBuilder.MenuItems.Menus;

import MenuBuilder.Caster.StringCaster;
import MenuBuilder.Displayer.TextMenuDisplayer;
import MenuBuilder.MenuItems.Menus.Interface.Menu;
import MenuBuilder.MenuItems.Interface.MenuItem;

public class FreeTextMenu extends Menu {

    public FreeTextMenu(String displayName, String title) {
        super(displayName, title);
        this.menuDisplayer = new TextMenuDisplayer();
        this.caster = new StringCaster();
    }

    @Override
    public void addToMenu(MenuItem item) {
        this.menu.put(item.getDisplayName(), item);
    }

    @Override
    public void ExecuteAction() {
        super.ExecuteAction("Text");
    }
}
