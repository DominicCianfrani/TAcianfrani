public class Enemy {
    protected String name;
    protected int hp;
    protected int damage;
    protected String fly;
    public Enemy(String name, int hp, int damage, String fly){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.fly = fly;
    }
    public String getName(){
        return this.name;
    }
    public boolean is_alive(){
        return (this.hp > 0);
    }
}
