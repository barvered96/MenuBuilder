package MenuBuilder;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class NumericalMenu extends Menu {
    private int numOptions;
    private Map<Integer, MenuItem> menu;

    public NumericalMenu(String displayName, String title) {
        this.numOptions = 0;
        this.displayName = displayName;
        this.title = title;
        this.menu = new LinkedHashMap<>();
        this.menuDisplayer = new NumericalMenuDisplayer();
        this.inputScanner = new IntScanner();
    }

    @Override
    public void addToMenu(MenuItem item) {
        this.menu.put(numOptions++, item);
    }

    @Override
    public void ExecuteAction() {
        this.menuDisplayer.print(this.title, menu);
        Integer selection = (Integer)this.inputScanner.getInput();
        menu.get(selection).ExecuteAction();
    }
}
