package MenuBuilder.MenuItems.Menus;

import MenuBuilder.Caster.IntCaster;
import MenuBuilder.Displayer.NumericalMenuDisplayer;
import MenuBuilder.MenuItems.Menus.Interface.Menu;
import MenuBuilder.MenuItems.Interface.MenuItem;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumericalMenu extends Menu {
    private int numOptions;
    protected IntCaster intCaster;
    protected Map<Integer, MenuItem> menu;

    public NumericalMenu(String displayName, String title) {
        super(displayName, title);
        this.numOptions = 0;
        this.menu = new LinkedHashMap<>();
        this.menuDisplayer = new NumericalMenuDisplayer();
        this.intCaster = new IntCaster();
    }

    @Override
    public void addToMenu(MenuItem item) {
        this.menu.put(numOptions++, item);
    }

    @Override
    public void ExecuteAction() {
        this.menuDisplayer.print(this.title, menu);
        Integer selection = this.intCaster.cast(this.inputScanner.getInput());
        if (selection != -1) {
            String errorMsg = this.inputValidator.validate(selection, menu);
            if (errorMsg == "") {
                menu.get(selection).ExecuteAction();
            }
            else {
                this.errorPrinter.printBadInput(errorMsg);
                this.ExecuteAction();
            }
        }
        else {
            this.errorPrinter.printUnMatchedInput("Numerical");
            this.ExecuteAction();
        }
    }
}
