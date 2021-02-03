package MenuBuilder.MenuItems.Menus.Interface;

import MenuBuilder.MenuItems.Interface.MenuItem;
import MenuBuilder.Printer.ErrorPrinter;
import MenuBuilder.Scanner.InputScanner;
import MenuBuilder.Validator.InputValidator;
import MenuBuilder.Displayer.Interface.MenuDisplayer;

public abstract class Menu implements MenuItem {
    protected String title;
    protected String displayName;
    protected MenuDisplayer menuDisplayer;
    protected InputScanner inputScanner;
    protected InputValidator inputValidator;
    protected ErrorPrinter errorPrinter;
    public Menu(String displayName, String title) {
        this.displayName = displayName;
        this.title = title;
        this.errorPrinter = new ErrorPrinter();
        this.inputValidator = new InputValidator();
        this.inputScanner = new InputScanner();
    }
    public abstract void addToMenu(MenuItem item);
    @Override
    public String getDisplayName() {
        return this.displayName;
    }
}
