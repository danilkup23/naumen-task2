package naumen.danilkup23;

import naumen.danilkup23.items.ExitItem;
import naumen.danilkup23.items.Item;
import naumen.danilkup23.items.StreamAPIFormatPrint;
import naumen.danilkup23.utils.ScannerUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ItemManager {
    private final String title = "--- Менеджер выбора заданий ---";
    private final Scanner scanner = new Scanner(System.in);
    private final Map<Integer, Item> itemList = new HashMap();
    private boolean isStarting = true;

    public ItemManager() {
        itemList.put(0, new ExitItem(this));
        itemList.put(3, new StreamAPIFormatPrint());
    }

    public void startApplication() {
        while (isStarting) {
            System.out.println(title);
            for(Map.Entry<Integer, Item> item : itemList.entrySet()) {
                System.out.println(item.getKey() + ". " + item.getValue().getTitle());
            }
            int choice = ScannerUtil.getValidatedInput("Введите номер пункта меню", scanner);
            itemList.get(choice).execute();
        }
    }

    public void setStarting(boolean isStarting) {
        this.isStarting = isStarting;
    }
}
