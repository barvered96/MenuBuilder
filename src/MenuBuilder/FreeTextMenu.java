package MenuBuilder;

import java.util.LinkedHashMap;
import java.util.Map;

class FreeTextMenu extends Menu {
    private Map<String, MenuItem> menu;

    public FreeTextMenu(String displayName, String title) {
        this.displayName = displayName;
        this.title = title;
        this.menu = new LinkedHashMap<>();
        this.menuDisplayer = new TextMenuDisplayer();
        this.inputScanner = new TextScanner();
    }

    @Override
    public void addToMenu(MenuItem item) {
        this.menu.put(item.getDisplayName(), item);
    }

    @Override
    public void ExecuteAction() {
        this.menuDisplayer.print(this.title, this.menu);
        String selection = (String)this.inputScanner.getInput();
        menu.get(selection).ExecuteAction();
    }
}
