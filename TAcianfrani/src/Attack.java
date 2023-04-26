public class Attack extends Action {

    public Attack(char hotkey, Enemy enemy, Player player) {
        super(Method.Attack, "Attack", hotkey, enemy);
    }

}
/*
    public void attack(Enemy enemy){
        Weapon best_weapon = new Weapon("None", "None", 0, 0);
        int max_dmg = 0;
        for (Item i:inventory){
            if (isinstance(i, items.Weapon)){
                if (i.damage > max_dmg){
                    max_dmg = i.damage;
                    best_weapon = i;
                }
            }
        } //End Code block for loop
        System.out.print(String.format("You use {0} against {1}!",best_weapon.name, enemy.name));
        enemy.hp -= best_weapon.damage;
        if (!enemy.is_alive()){
            System.out.print(String.format("You killed {0}!",enemy.name));
        }else{
            System.out.print(String.format("{0} HP is {1}.",enemy.name, enemy.hp));
        }
    } //End Code block attack method

 */