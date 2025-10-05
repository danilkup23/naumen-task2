package naumen.danilkup23.items;

import naumen.danilkup23.ItemManager;

public class ExitItem extends Item{
    private ItemManager itemManager;
    private final String message = "Завершение приложения...";

    public ExitItem(ItemManager itemManager) {
        this.itemManager = itemManager;
        title = "Выход из приложения";
    }

    @Override
    public void execute() {
        System.out.println(message);
        itemManager.setStarting(false);
    }
}
