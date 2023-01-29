public class Main {
    public static void main(String[] args) {
        //Item i1 = new Item("item name", "item desc", 10);
        //Item i2 = new Item("item name", "item desc", 11);

        Gold goldBar = new Gold(10);
        Sword magicSword = new Sword();
        Pillow softPillow = new Pillow();
        Mace bigMace = new Mace();

        //Below is just to show that the class is being called for the screenshot
        System.out.println(goldBar.getName());
        System.out.println(magicSword.getName());
        System.out.println(softPillow.getName());
        System.out.println(bigMace.getName());

    }
}