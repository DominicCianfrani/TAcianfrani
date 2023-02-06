public class Main {
    public static void main(String[] args) {
        //Item i1 = new Item("item name", "item desc", 10);
        //Item i2 = new Item("item name", "item desc", 11);

        Gold goldBar = new Gold(10);
        Sword magicSword = new Sword();
        Pillow softPillow = new Pillow();
        Mace bigMace = new Mace();

        Ogre greenOgre = new Ogre();
        Ogre redOgre = new Ogre();
        Zombie slowZombie = new Zombie();
        Zombie fastZombie = new Zombie();
        Dog spotDog = new Dog();
        Dragon redDragon = new Dragon();

        //Below is just to show that the class is being called for the screenshot
        System.out.println(goldBar.getName());
        System.out.println(magicSword.getName());
        System.out.println(softPillow.getName());
        System.out.println(bigMace.getName());

        System.out.println(greenOgre.getName());
        System.out.println(redOgre.getName());
        System.out.println(slowZombie.getName());
        System.out.println(fastZombie.getName());
        System.out.println(spotDog.getName());
        System.out.println(redDragon.getName());

    }
}