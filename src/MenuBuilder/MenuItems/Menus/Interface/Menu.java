package MenuBuilder.MenuItems.Menus.Interface;

import MenuBuilder.Caster.Interface.ObjectCaster;
import MenuBuilder.MenuItems.Interface.MenuItem;
import MenuBuilder.Printer.ErrorPrinter;
import MenuBuilder.Scanner.InputScanner;
import MenuBuilder.Validator.InputValidator;
import MenuBuilder.Displayer.Interface.MenuDisplayer;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Menu implements MenuItem {
    protected String title;
    protected String displayName;
    protected MenuDisplayer menuDisplayer;
    protected InputScanner inputScanner;
    protected InputValidator inputValidator;
    protected ErrorPrinter errorPrinter;
    protected Map<Object, MenuItem> menu;
    protected ObjectCaster caster;

    public Menu(String displayName, String title) {
        this.displayName = displayName;
        this.title = title;
        this.errorPrinter = new ErrorPrinter();
        this.inputValidator = new InputValidator();
        this.inputScanner = new InputScanner();
        this.menu = new LinkedHashMap<>();
    }

    public abstract void addToMenu(MenuItem item);

    @Override
    public String getDisplayName() {
        return this.displayName;
    }

    public void ExecuteAction(String type) {
        this.menuDisplayer.print(this.title, menu);
        Object selection = caster.cast(this.inputScanner.getInput());
        if (selection != null) {
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
            this.errorPrinter.printUnMatchedInput(type);
            this.ExecuteAction();
        }
    }
}
