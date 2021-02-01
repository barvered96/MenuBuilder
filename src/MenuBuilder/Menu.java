package MenuBuilder;

public abstract class Menu implements MenuItem {
    String title;
    String displayName;
    MenuDisplayer menuDisplayer;
    InputScanner inputScanner;
    public abstract void addToMenu(MenuItem item);
    @Override
    public String getDisplayName() {
        return this.displayName;
    }
}
