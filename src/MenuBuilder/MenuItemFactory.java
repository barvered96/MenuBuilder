package MenuBuilder;

public class MenuItemFactory {
    public Menu getMenu(String menuType, String displayName, String title) {
        switch(menuType) {
            case("FreeText"):
                return new FreeTextMenu(displayName, title);
            case("Numerical"):
                return new NumericalMenu(displayName, title);

        }
        return null;
    }
    public MenuItem getItem(String menuType, String displayName, Menu parentMenu) {
        switch(menuType) {
            case("Return"):
                return new ReturnActionItem(parentMenu,displayName);
            case("Exit"):
                return new ExitActionItem(displayName);
        }
        return null;
    }
}
