package MenuBuilder.MenuItems.Menus;

import MenuBuilder.Caster.IntCaster;
import MenuBuilder.Displayer.NumericalMenuDisplayer;
import MenuBuilder.MenuItems.Menus.Interface.Menu;
import MenuBuilder.MenuItems.Interface.MenuItem;
import MenuBuilder.Printer.NumericalErrorPrinter;

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
        this.errorPrinter = new NumericalErrorPrinter();
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
            if (this.inputValidator.validate(selection, menu) == "") {
                menu.get(selection).ExecuteAction();
            }
            else {
                this.errorPrinter.printBadInput();
                this.ExecuteAction();
            }
        }
        else {
            this.errorPrinter.printUnMatchedInput();
            this.ExecuteAction();
        }

    }
}