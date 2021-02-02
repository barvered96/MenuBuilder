package MenuBuilder;

public abstract class Menu implements MenuItem {
    String title;
    String displayName;
    MenuDisplayer menuDisplayer;
    InputScanner inputScanner;
    InputValidator inputValidator;
    ErrorPrinter errorPrinter;
    public Menu(String displayName, String title) {
        this.displayName = displayName;
        this.title = title;
        this.inputValidator = new InputValidator();
        this.inputScanner = new InputScanner();
    }
    public abstract void addToMenu(MenuItem item);
    @Override
    public String getDisplayName() {
        return this.displayName;
    }
}
