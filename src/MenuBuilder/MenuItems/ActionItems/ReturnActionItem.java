package MenuBuilder.MenuItems.ActionItems;

import MenuBuilder.MenuItems.ActionItems.Interface.ActionItem;
import MenuBuilder.MenuItems.Menus.Interface.Menu;
import MenuBuilder.MenuItems.Interface.MenuItem;

public class ReturnActionItem extends ActionItem {
    protected MenuItem parentMenu;
    public ReturnActionItem(Menu parentMenu, String displayName) {
        super(displayName);
        this.parentMenu = parentMenu;
    }

    @Override
    public void ExecuteAction() {
        this.parentMenu.ExecuteAction();
    }
}
