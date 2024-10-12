package view.modulMenu;

import consoleUI.Menu.Menu;

import java.io.IOException;

public interface MenuFunc {
    String getMenuItemName();
    void use(Menu menu) throws IOException;
}
