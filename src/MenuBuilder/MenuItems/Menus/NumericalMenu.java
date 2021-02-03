package MenuBuilder.MenuItems.Menus;

import MenuBuilder.Caster.IntCaster;
import MenuBuilder.Displayer.NumericalMenuDisplayer;
import MenuBuilder.MenuItems.Menus.Interface.Menu;
import MenuBuilder.MenuItems.Interface.MenuItem;

public class NumericalMenu extends Menu {
    private int numOptions;

    public NumericalMenu(String displayName, String title) {
        super(displayName, title);
        this.numOptions = 0;
        this.menuDisplayer = new NumericalMenuDisplayer();
        this.caster = new IntCaster();
    }

    @Override
    public void addToMenu(MenuItem item) {
        this.menu.put(numOptions++, item);
    }

    @Override
    public void ExecuteAction() {
        super.ExecuteAction("Numerical");
    }
}
