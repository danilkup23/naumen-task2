package naumen.danilkup23.items;

abstract public class Item {
    protected String title;

    public String getTitle() {
        return title;
    }

    abstract public void execute();
}
