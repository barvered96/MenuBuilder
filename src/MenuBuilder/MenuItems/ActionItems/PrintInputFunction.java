package MenuBuilder.MenuItems.ActionItems;

import MenuBuilder.Caster.StringCaster;
import MenuBuilder.MenuItems.Menus.Interface.Menu;
import MenuBuilder.Scanner.InputScanner;

public class PrintInputFunction extends PrintFunction {
    InputScanner inputScanner;
    StringCaster stringCaster;

    public PrintInputFunction(Menu parentMenu, String displayName) {
        super(parentMenu, displayName);
        this.inputScanner = new InputScanner();
        this.stringCaster = new StringCaster();
    }
    @Override
    public void ExecuteAction() {
        System.out.println("Please enter input: ");
        this.text = this.stringCaster.cast(this.inputScanner.getInput());
        super.ExecuteAction();
    }
}
