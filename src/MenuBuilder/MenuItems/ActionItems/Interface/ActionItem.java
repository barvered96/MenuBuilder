package MenuBuilder.MenuItems.ActionItems.Interface;

import MenuBuilder.MenuItems.Interface.MenuItem;

public abstract class ActionItem implements MenuItem {
    protected String displayName;
    protected ActionItem(String displayName) {
        this.displayName = displayName;
    }
    @Override
    public String getDisplayName() {
        return displayName;
    }
}
