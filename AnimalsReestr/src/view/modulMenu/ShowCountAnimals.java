package view.modulMenu;

import view.ConsoleView;

import java.io.IOException;

public class ShowCountAnimals implements MenuFunc{
    @Override
    public String getMenuItemName() {
        return "Показать количество зарегистрированных животных";
    }

    @Override
    public void use(ConsoleView menu) throws IOException {
        menu.showCountAnimals();
    }
}

