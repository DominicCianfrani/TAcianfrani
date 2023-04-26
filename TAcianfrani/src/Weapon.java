public class Weapon extends Item {

    private int damage;

    public Weapon(String name, String desc, int value, int damage) {
        super(name, desc, value);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return String.format("%s\n=====\n%s\nValue: %d\nDamage: %d", this.name, this.desc, this.value, this.damage);
    }
}