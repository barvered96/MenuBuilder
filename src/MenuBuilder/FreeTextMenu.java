package MenuBuilder;

import java.util.LinkedHashMap;
import java.util.Map;

class FreeTextMenu extends Menu {
    private Map<String, MenuItem> menu;
    private StringCaster stringCaster;

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
