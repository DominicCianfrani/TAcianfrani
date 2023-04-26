public class Item {

    protected String name;
    protected String desc;
    protected int value;

    public Item() {
    }

    public Item(String name, String desc, int value) {
        this.name = name;
        this.desc = desc;
        this.value = value;
    }

    public Item(String name) {
        this.name = name;
        this.desc = "Dominic Cianfrani";
        this.value = 15;
    }

    public Item(String desc, int value) {
        this.desc = desc;
        this.value = value;
    }

    public Item(int value) {
        this.value = value;
    }

    public void setName(String nameStr) {
        this.name = nameStr;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("%s \n=====\nDescription: %s \nValue: %d \n", this.name, this.desc, this.value);
    }
}
