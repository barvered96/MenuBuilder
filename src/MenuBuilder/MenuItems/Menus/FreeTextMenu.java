package MenuBuilder.MenuItems.Menus;

import MenuBuilder.Caster.StringCaster;
import MenuBuilder.Displayer.TextMenuDisplayer;
import MenuBuilder.MenuItems.Menus.Interface.Menu;
import MenuBuilder.MenuItems.Interface.MenuItem;
import MenuBuilder.Printer.TextErrorPrinter;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreeTextMenu extends Menu {
    protected Map<String, MenuItem> menu;
    protected StringCaster stringCaster;

    public FreeTextMenu(String displayName, String title) {
        super(displayName, title);
        this.menu = new LinkedHashMap<>();
        this.menuDisplayer = new TextMenuDisplayer();
        this.stringCaster = new StringCaster();
        this.errorPrinter = new TextErrorPrinter();
    }

    @Override
    public void addToMenu(MenuItem item) {
        this.menu.put(item.getDisplayName(), item);
    }

    @Override
    public void ExecuteAction() {
        this.menuDisplayer.print(this.title, this.menu);
        String selection = this.stringCaster.cast(this.inputScanner.getInput());
        if (selection != "") {
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
